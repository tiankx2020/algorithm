package com.tkx.java.leecodeHot100;

/**
 * 动态规划
 * dp[i][j]表示 从i到j是否构成回文字符串
 * if(s[i] == s[j])   如果长度小于等于3 true 或者 s[i+1][j+1] == true  则是true
 */
public class _5最长回文子串 {
    public String longestPalindrome(String s) {
        String ans = "";
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        for(int len=1;len<=length;len++){
            for(int i=0,j=i+len-1;j<s.length();i++,j++){
                if(s.charAt(i) == s.charAt(j)){
                    if(j-i+1<=3 || dp[i+1][j-1]){
                        dp[i][j] = true;
                        if(j-i+1>ans.length()){
                            ans = s.substring(i,j+1);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
