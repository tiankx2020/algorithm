package com.tkx.java.算法思想.动态规划;

/**
 * 求解思路,动态规划
 */
public class _5最长回文子串 {
    public static void main(String[] args) {
        String s = "aaaa";
        _5最长回文子串 最长回文子串 = new _5最长回文子串();
        String result = 最长回文子串.longestPalindrome(s);
        System.out.println(result);

    }

    public String longestPalindrome(String s) {
        char[] cs = s.toCharArray();
        String res = "";
        // dp[i][j] 表示从下标i-j的子字符串是否是回文字符串
        boolean[][] dp = new boolean[cs.length][cs.length];
        for (int len = 1; len <= s.length(); len++) {
            for (int i = 0, j = i + len - 1; j < s.length(); i++, j++) {
                if (cs[i] == cs[j]) {
                    // 长度小于等于2,直接可以判定为回文字符串
                    if (len <= 2) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                if (dp[i][j] && len > res.length()) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
}
