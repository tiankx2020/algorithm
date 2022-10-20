package com.tkx.java.每日一题;

import java.util.Objects;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月28日 12:21
 */
public class T0102 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cba";
        System.out.println(CheckPermutation(s1, s2));
    }
    public static boolean CheckPermutation(String s1, String s2) {
        int[] c1 = new int[128];
        int[] c2 = new int[128];
        for (char c : s1.toCharArray()) {
            c1[c]++;
        }
        for (char c : s2.toCharArray()) {
            c2[c]++;
        }
        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i]) return false;
        }
        return true;
    }
}
