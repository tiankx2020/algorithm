package com.tkx.java.笔试题.去哪儿9_7;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月07日 15:06
 */
public class T1 {
    public int maxScore (int energy, int[][] actions) {
        int[] v = new int[actions.length+1];
        int[] w = new int[actions.length+1];
        for(int i=0;i<actions.length;i++){
            w[i+1] = actions[i][0];
            v[i+1] = actions[i][1];
        }
        //
        int N = actions.length;
        int V = energy;
        int[][] dp = new int[N+1][V+1];
        for(int i=1;i<=N;i++){
            for(int j=0;j<=V;j++){
                if(j >= w[i]){
                    dp[i][j] = Math.max(dp[i-1][j-w[i]]+v[i], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[N][V];
    }


}
