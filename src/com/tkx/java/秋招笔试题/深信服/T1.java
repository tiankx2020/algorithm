package com.tkx.java.秋招笔试题.深信服;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月01日 19:37
 */
public class T1 {
    public int ncov_defect(int[][] grid) {
        int m = grid.length;
        int res = 0;
        for (int i = 0; i < m; i++) {
            int n = grid[i].length;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    if (i - 1 >= 0 && grid[i - 1][j] == 0) {
                        grid[i - 1][j] = -1;
                        res++;
                    }
                    if (i + 1 < m && grid[i + 1][j] == 0) {
                        grid[i + 1][j] = -1;
                        res++;
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] == 0) {
                        grid[i][j - 1] = -1;
                        res++;
                    }
                    if (j + 1 < n && grid[i][j + 1] == 0) {
                        grid[i][j + 1] = -1;
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
