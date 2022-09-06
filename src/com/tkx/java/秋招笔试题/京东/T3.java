package com.tkx.java.秋招笔试题.京东;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月03日 19:29
 */
public class T3 {
    static int res = 0;
    static Set<String> set;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cs = sc.nextLine().toCharArray();
        set = new HashSet<>();
        dfs(0,cs,"");
        System.out.println("size:"+set.size());
        for (String s : set) {
            res+=getWeight(s);
        }
        System.out.println(res);
        // System.out.println(getWeight("())())"));
    }
    public static void dfs(int index,char[] cs,String s){
        if(index==cs.length){
            set.add(s);
            return;
        }
        dfs(index+1,cs,s+cs[index]);
        dfs(index+1,cs,s);
    }

    public static int getWeight(String s){
        int num = 0;
        int res = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                num++;
            }else{
                if(num>0){
                    num--;
                    res+=2;
                }

            }
        }
        return res;
    }
}
