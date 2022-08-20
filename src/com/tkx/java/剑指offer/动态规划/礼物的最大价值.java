package com.tkx.java.剑指offer.动态规划;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月11日 20:57
 */
public class 礼物的最大价值 {
    public int maxValue(int[][] grid) {
        for(int i=1;i<grid[0].length;i++){
            grid[0][i]+=grid[0][i-1];
        }
        for(int j=1;j<grid.length;j++){
            grid[j][0]+=grid[j-1][0];
        }
        for(int i=1;i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
                grid[i][j] = Math.max(grid[i-1][j],grid[i][j-1])+grid[i][j];
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
