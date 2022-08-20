package com.tkx.java.leecode周赛.D287地平线;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月03日 11:14
 */
public class Encrypter {
    char[] keys;
    String[] values;
    String[] dictionary;
    HashMap<Character,Integer> map1 = new HashMap<>();
    HashMap<String, List<Integer>> map2 = new HashMap<>();
    Set<String> set= new HashSet<>();
    public Encrypter(char[] keys, String[] values, String[] dictionary) {
        this.keys = keys;
        this.values = values;
        this.dictionary = dictionary;
        for (String s : dictionary) {
            set.add(s);
        }
        for(int i=0;i<values.length;i++){
            List<Integer> list = map2.getOrDefault(values[i], new ArrayList<>());
            list.add(i);
            map2.put(values[i],list);
        }
    }

    //加密过程
    public String encrypt(String word1) {
        StringBuilder sb = new StringBuilder();
        char[] cs = word1.toCharArray();
        for (char c : cs) {
            for(int i=0;i<keys.length;i++){
                if(keys[i]==c){
                    sb.append(values[i]);
                    break;
                }
            }
        }
        return sb.toString();
    }
    int ans = 0;
    List<Integer> list;
    //解密过程
    public int decrypt(String word2) {
        ans = 0;
        list = new ArrayList<>();
        char[] cs = word2.toCharArray();
        dfs(cs,0);
        return ans;
    }

    public void dfs(char[] cs,int index){
        if(index==cs.length){
            StringBuilder sb = new StringBuilder();
            for (int x : list) {
                sb.append(keys[x]);
            }
            String string = sb.toString();
            if(set.contains(string)){
                ans++;
            }
            return;
        }
        String str = ""+cs[index]+cs[index+1];
        List<Integer> tmp = map2.get(str);
        if(tmp==null) return;
        for (int x : tmp) {
            list.add(x);
            dfs(cs,index+2);
            list.remove(list.size()-1);
        }
    }
}
