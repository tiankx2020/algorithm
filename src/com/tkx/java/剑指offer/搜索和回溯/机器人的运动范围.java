package com.tkx.java.剑指offer.搜索和回溯;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月11日 21:30
 */
public class 机器人的运动范围 {
    int ans = 0;
    boolean[][] f;
    public int movingCount(int m, int n, int k) {
        f = new boolean[m][n];
        dfs(0,0,m,n,k);
        return ans;
    }

    public void dfs(int i,int j,int m,int n,int k){
        if(i>=m || j>=n) return;
        if(i%10+i/10+j%10+j/10 >k) return;
        if(f[i][j] = true) return;
        f[i][j] = true;
        ans++;
        dfs(i+1,j,m,n,k);
        dfs(i,j+1,m,n,k);
    }
}
