package com.tkx.java.笔试题.游族;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月13日 20:03
 */
public class T2 {
    public int minPathSum (int[][] grid) {
        // write code here
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    dp[0][0] = grid[0][0];
                }else if(i==0){
                    dp[i][j] = dp[i][j-1]+grid[i][j];
                }else if(j==0){
                    dp[i][j] = dp[i-1][j]+grid[i][j];
                }else {
                    dp[i][j] = Math.min(dp[i][j-1]+grid[i][j],dp[i-1][j]+grid[i][j]);
                }
            }
        }
        return dp[m-1][n-1];
    }
}
