package com.tkx.java.秋招笔试题.深信服;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月01日 19:37
 */
public class T2 {
    public int nucleicAcidTestWay (int n) {
        // 二叉树，1的子节点可以是0和1，0的子节点只能是0
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = 1;
        for(int i = 1; i < n; i++){
            dp[i][0] = dp[i - 1][1];
            dp[i][1] = dp[i - 1][0] + dp[i - 1][1];
        }
        return dp[n - 1][1] + dp[n - 1][0];
    }
}
