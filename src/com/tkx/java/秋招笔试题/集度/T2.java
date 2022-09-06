package com.tkx.java.秋招笔试题.集度;

import java.util.Arrays;
import java.util.Objects;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月05日 14:43
 */
public class T2 {
    public static void main(String[] args) {

    }

    public boolean isEquals (String str1, String str2) {
        int[] num1 = new int[26];
        int[] num2 = new int[26];
        for (char c : str1.toCharArray()) {
            num1[c-'a']++;
        }
        for (char c : str2.toCharArray()) {
            num2[c-'a']++;
        }
        return Arrays.equals(num1,num2);
    }
}
