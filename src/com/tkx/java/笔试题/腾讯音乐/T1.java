package com.tkx.java.笔试题.腾讯音乐;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月08日 19:17
 */
public class T1 {
    public int minOperations(String str) {
        int[] nums = new int[26];
        for (char data : str.toCharArray()) {
            nums[data - 'a']++;
        }
        // 找出所有的字符类型，如果有多个的，去除其中的两个算一个
        // 比如 aaabbbbccccc 算有2+2+3中字符，做少要5中变换才能所有的都不同
        int sum = 0; // 要合二为一的次数
        int mod = 0; // 剩余字母的种类
        for (int data : nums) {
            sum += data / 2; // 要变换多少次
            mod += data / 2 + data % 2; // 字母的种类
        }
        if(mod > 26){
            sum += mod - 26; // 加上又要变换的次数
        }
        return sum;
    }
}
