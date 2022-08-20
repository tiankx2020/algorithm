package com.tkx.java.leecodeHot100;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月16日 11:17
 */
public class _5最长回文子串 {
    public String longestPalindrome(String s) {
        // int len = s.length();
        // boolean[][] dp = new boolean[len+1][len+1];
        // for(int i=0;i<s.length();i++) dp[i][i] =true;
        // for(int i=1;i<len+1;i++){
        //     for(int j=i+1;j<len+1;j++){
        //         if(s.charAt(i)==s.charAt(j)){
        //
        //         }
        //     }
        // }
        String ans = s.charAt(0)+"";
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        for(int len=1;len<=s.length();len++){
            for(int i=0,j=i+len-1;j<s.length();i++,j++){
                if(s.charAt(i) == s.charAt(j)){
                    if(j-i<1 || dp[i+1][j-1]==true){
                        if((j-i+1) >ans.length()) ans = s.substring(i,j+1);
                        dp[i][j] = true;
                    }
                }
            }
        }
        return ans;
    }
}
