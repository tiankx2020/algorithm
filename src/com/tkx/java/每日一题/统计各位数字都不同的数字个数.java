package com.tkx.java.每日一题;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月11日 14:03
 */
public class 统计各位数字都不同的数字个数 {
    public static void main(String[] args) {
    }

    public int countNumbersWithUniqueDigits(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 10;
        for (int i=2;i<=n;i++){
            dp[i] = dp[i-1] + (dp[i-1]-dp[i-2])*(10-i);
        }
        return dp[n];
    }


}
