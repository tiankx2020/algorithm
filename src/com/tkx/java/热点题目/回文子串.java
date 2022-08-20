package com.tkx.java.热点题目;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月13日 11:20
 */
public class 回文子串 {
    public int countSubstrings(String s) {
        char[] cs = s.toCharArray();
        boolean[][] dp = new boolean[cs.length][cs.length];
        for(int i=0;i<cs.length;i++){
            dp[i][i] = true;
        }
        int ans = 0;
        for(int i=0;i<cs.length;i++){
            for(int j=i;j>=0;j--){
                if(j==i){
                    dp[i][j] = true;
                }else if(j+1==i){
                    if(cs[i]==cs[j]){
                        dp[i][j] = true;
                    }
                }else{
                    if(cs[i]==cs[j]){
                        dp[i][j]|=dp[i-1][j-1];
                    }
                }
                if(dp[i][j] == true){
                    ans++;
                }
            }
        }
        return ans;
    }


}
