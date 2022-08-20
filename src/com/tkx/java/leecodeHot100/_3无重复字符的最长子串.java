package com.tkx.java.leecodeHot100;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/**
   所用方法：利用start记录字符串的开始下标的前一个节点
            end方法记录字符串的结束下标
    每次加入end的时候判断字符串中是否穿在s[end],调用map得到i
        如果i<=start 说明不存在
        如果i>start  说明存在，
        i = Math.max(i,start) //关键
        ans = Math.max(ans,end-start)

    return ans;
 * @date: 2022年05月16日 9:45
 */
public class _3无重复字符的最长子串 {
    // public int lengthOfLongestSubstring(String s) {
    //     int start = -1, end = 0;
    //     int ans = 0;
    //     Map<Character, Integer> map = new HashMap<>();
    //     for (; end < s.length(); end++) {
    //         //判断和s[end]字符一样的最近下标i
    //         int i = map.getOrDefault(s.charAt(end), -1);
    //         //取 i和start的最大值
    //         start = Math.max(start, i);
    //         ans = Math.max(ans, end - start);
    //         map.put(s.charAt(end), end);
    //     }
    //     return ans;
    // }
    public static void main(String[] args) {
        String s = "abcabcbb";
        lengthOfLongestSubstring(s);
    }
    //第二种解法
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int i=0,j=1;
        int ans = 1;
        for(;j<s.length();j++){
            while (i!=j && s.charAt(i)==s.charAt(j)) i++;
            ans = Math.max(ans,j-i+1);
        }
        return ans;
    }
}
