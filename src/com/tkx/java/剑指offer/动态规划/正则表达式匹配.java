package com.tkx.java.剑指offer.动态规划;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月11日 20:28
 */
public class 正则表达式匹配 {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[0][0] =  true;
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=p.length();j++){
                if(p.charAt(j-1)=='*'){
                    dp[i][j] = dp[i][j-2];
                    if(matches(s,p,i,j-1)){
                        dp[i][j]|=dp[i-1][j];
                    }
                }else{
                    if(matches(s,p,i,j)){
                        dp[i][j] = dp[i-1][j-1];
                    }
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }

    public boolean matches(String s,String p ,int i, int j){
        if(i==0) return false;
        if(p.charAt(j-1)=='.') return true;
        return s.charAt(i-1) == p.charAt(j-1);
    }
}
