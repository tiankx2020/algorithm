package com.tkx.java.leecode周赛.安贤311;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月19日 15:59
 */
public class T2 {
    public int longestContinuousSubstring(String s) {
        int[] dp = new int[s.length()];
        char[] cs = s.toCharArray();
        Arrays.fill(dp,1);
        for(int i=1;i<cs.length;i++){
            if(cs[i]==cs[i-1]+1){
                dp[i] = dp[i]+1;
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
