package com.tkx.java.剑指offer.动态规划;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月11日 20:50
 */
public class 把数字翻译成字符串 {
    public int translateNum(int num) {
        String s ="0"+num;
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for(int i=1;i<s.length();i++){
            int x = Integer.valueOf(s.substring(i-1,i+1));
            dp[i]+=dp[i-1];
            if(x>=10 && x<=25 && i!=1){
                dp[i]+=dp[i-2];
            }
        }
        return dp[dp.length-1];
    }
}
