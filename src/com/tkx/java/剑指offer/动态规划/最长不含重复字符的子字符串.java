package com.tkx.java.剑指offer.动态规划;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月11日 21:01
 */
public class 最长不含重复字符的子字符串 {

    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        //i 相当于有效字符的起点
        int i=-1;
        for(int j=0;j<s.length();j++){
            int x = map.getOrDefault(s.charAt(j), -1);
            //重要
            i = Math.max(i,x);
            ans = Math.max(ans,j-i);
            map.put(s.charAt(j),j);
        }
        return ans;
    }
}
