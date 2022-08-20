package com.tkx.java.每日一题;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月27日 14:18
 */
public class 太平洋大西洋水流问题 {
    boolean f1 = false;
    boolean f2 = false;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        List<List<Integer>> list = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                f1 = false;
                f2 = false;
                dfs(i,j,heights);
                if(f1&&f2){
                    list.add(Arrays.asList(i,j));
                }
            }
        }
        return  list;
    }

    public void dfs(int i, int j, int[][] heights) {
        if (i < 0 || i == heights.length) {
            f1 = true;
            return;
        }
        if (j < 0 || j == heights[0].length) {
            f2 = true;
            return;
        }
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

    }
}
