package com.tkx.java.算法思想.滑动窗口;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月31日 11:03
 */
public class _567字符串的排列 {
    public static void main(String[] args) {
        String s1 ="ab";
        String s2 = "eidbaooo";
        checkInclusion(s1,s2);
    }
    public static boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;
        int[] nums1 = new int[26];
        int[] nums2 = new int[26];
        // 记录数量
        for (char c : s1.toCharArray()) {
            nums1[c-'a']++;
        }
        //
        for(int i=0;i<s1.length()-1;i++){
            nums2[s2.charAt(i)-'a']++;
        }
        // 先加再比较 最后删除
        for(int i=s1.length()-1;i<s2.length();i++){
            nums2[s2.charAt(i)-'a']++;
            if(Arrays.equals(nums1,nums2)) return true;
            nums2[s2.charAt(i-s1.length()+1)-'a']--;
        }
        return false;
    }

}
