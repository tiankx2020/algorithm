package com.tkx.java.热点题目;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月01日 20:36
 */
public class 最大正方形 {
    public static void main(String[] args) {
        Set<Integer> set  =new HashSet<>();

    }

    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int area = 0;
        for(int i=0;i<m;i++){
            if(matrix[i][0]=='1'){
                dp[i][0] = 1;
                area = Math.max(area,dp[i][0]);
            }
        }
        for(int j=0;j<n;j++){
            if(matrix[0][j]=='1'){
                dp[0][j]=1;
                area = Math.max(area,dp[0][j]);
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]))+1;
                area = Math.max(area,dp[i][j]);
            }
        }
        return area*area;
    }
}
