package com.tkx.java.每日一题;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月16日 15:53
 */
public class T886 {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        // 表示是否访问到了
       boolean[] v = new boolean[n+1];
       // 表示 1..N的图
       int[][] g = new int[n+1][n+1];
       for(int i=0;i<g.length;i++){
           Arrays.fill(g[i],1);
       }
        for(int i=0;i<dislikes.length;i++){
            int a = dislikes[i][0];
            int b = dislikes[i][1];
            // 表示不可达
            g[a][b] = 0;
            g[b][a] = 0;
        }
        int num = 0;
        for(int i=1;i<=n;i++){
            if(v[i]==false){
                num++;
                if(num>=2) return false;
            }
        }
        return true;
    }

    public void dfs(int[][] g , int index,boolean[] v,int n){
        v[index] = true;
        for(int i=1;i<=n;i++){
            if(v[i]==false && g[i][index]==1){
                dfs(g,i,v,n);
            }
        }
    }
}
