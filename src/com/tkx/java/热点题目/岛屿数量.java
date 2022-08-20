package com.tkx.java.热点题目;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月11日 8:51
 */
public class 岛屿数量 {
    public int numIslands(char[][] grid) {
        int ans = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1') {
                    ans++;
                    bfs(grid,i,j);
                }
            }
        }
        return ans;
    }

    public void bfs(char[][] grid,int i,int j){
        Queue<int[]> queue  = new LinkedList<>();
        queue.add(new int[]{i,j});
        grid[i][j] = '0';
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        while (queue.size()>0){
            int[] tmp = queue.remove();
            for(int k=0;k<dir.length;k++){
                int nextI = tmp[0]+dir[k][0];
                int nextJ = tmp[1]+dir[k][1];
                if(nextI>=0 && nextI<grid.length && nextJ>=0 && nextJ<grid[0].length
                    && grid[nextI][nextJ]=='1'){
                    grid[nextI][nextJ]='0';
                    queue.add(new int[]{nextI,nextJ});
                }
            }
        }
    }

    public void dfs(char[][] grid,int i, int j){
        if(i<0 || i>=grid.length) return;
        if(j<0 || j>=grid[0].length) return;
        if(grid[i][j]=='0') return;
        grid[i][j] = '0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        grid[i][j] ='1';
    }
}
