package com.tkx.java.每日一题;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月05日 18:22
 */
public class T811 {
    public static void main(String[] args) {
        String[] cpdomains = {"9001 discuss.leetcode.com"};
        List<String> strings = subdomainVisits(cpdomains);
        System.out.println(strings);
    }
    public static List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map  = new HashMap<>();
        List<String> res = new ArrayList<>();
        for (String cpdomain : cpdomains) {
            for(int i=cpdomain.length()-1;i>=0;i--){
                if(cpdomain.charAt(i)=='.' || cpdomain.charAt(i)==' '){
                    String str = cpdomain.substring(i+1);
                    int num = map.getOrDefault(str, 0);
                }
            }
        }
        for(String key:map.keySet()){
            res.add(map.get(key)+" "+key);
        }
        return res;
    }
}
