package com.tkx.java.每日一题;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月13日 13:16
 */
public class T791 {
    public String customSortString(String order, String s) {
        int[] nums = new int[26];
        for (char c : s.toCharArray()) {
            nums[c-'a']++;
        }
        // 结果返回值
        StringBuilder sb = new StringBuilder();
        // 记录order中存在的
        for (char c : order.toCharArray()) {
            for(int i=0;i<nums[c-'a'];i++){
                sb.append(c);
            }
            nums[c-'a'] = 0;
        }
        // 记录order中不存在的
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i];j++){
                sb.append((char)(i+'a'));
            }
        }
        return sb.toString();
    }
}
