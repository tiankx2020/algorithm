package com.tkx.java.剑指offer.动态规划;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月11日 21:10
 */
public class 丑数 {
    public int nthUglyNumber(int n) {
        int a=0,b=0,c=0;
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i=1;i<n;i++){
            int min = Math.min(dp[a]*2,Math.min(dp[b]*3,dp[c]*5));
            dp[i] = min;
            if(dp[a]*2 == min) a++;
            if(dp[b]*3 == min) b++;
            if(dp[c]*5 == min) c++;
        }
        return dp[n-1];
    }
}
