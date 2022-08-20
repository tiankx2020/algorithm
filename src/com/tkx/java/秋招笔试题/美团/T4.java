package com.tkx.java.秋招笔试题.美团;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月20日 11:09
 */
public class T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m+1];
        int[] arr2 = new int[n+1];
        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=1;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }
        for(int i=1;i<dp.length;i++){
            dp[i][0]=dp[i-1][0]+Math.abs(arr1[i]);
        }
        for(int i=1;i<dp[0].length;i++){
            dp[0][i]=dp[0][i-1]+Math.abs(arr2[i]);
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                dp[i][j] =Math.min(dp[i-1][j]+Math.abs(arr1[i]),dp[i-1][j-1]+Math.abs(arr1[i]-arr2[j]));
                dp[i][j] =Math.min(dp[i][j-1]+Math.abs(arr2[j]),dp[i][j]);
            }
        }
        System.out.println(dp[m][n]);

    }
}
