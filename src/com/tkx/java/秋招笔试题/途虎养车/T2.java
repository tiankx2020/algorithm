package com.tkx.java.秋招笔试题.途虎养车;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月31日 19:43
 */
public class T2 {

    public int change(int[] oils, int box){
        if(box ==0) return 0;
        int[] dp = new int[box +1];
        for(int i=1;i<dp.length;i++){
            dp[i]= box +1;
        }
        for(int i=1;i<dp.length;i++){
            for(int coin: oils){
                if(i-coin<0) continue;
                if(i>=coin){
                    dp[i]=Math.min(dp[i],1+dp[i-coin]);
                }
            }
        }
        if(dp[box]== box +1){
            return -1;
        }
        return dp[box];
    }
}
