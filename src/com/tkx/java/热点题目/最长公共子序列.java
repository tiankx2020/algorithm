package com.tkx.java.热点题目;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月10日 21:23
 */

/**
 * 考点：动态规划
 */
public class 最长公共子序列 {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] =Math.max(dp[i][j],dp[i-1][j-1]+1);
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
