package com.tkx.java.滑动窗口;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月03日 21:27
 */
public class 字符串的排列 {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr1 = new int[26];
        if(s1.length()>s2.length()) return false;
        for (char c : s1.toCharArray()) {
            arr1[c - 'a']++;
        }
        int[] arr2 = new int[26];
        for(int i=0;i<s1.length()-1;i++){
            arr2[s2.charAt(i)-'a']++;
        }
        for(int i=s1.length()-1;i<s2.length();i++){
            arr2[s2.charAt(i)-'a']++;
            if(Arrays.equals(arr1,arr2)){
                return true;
            }
            arr2[s2.charAt(i-s1.length()+1)-'a']--;
        }
        return false;
    }
}
