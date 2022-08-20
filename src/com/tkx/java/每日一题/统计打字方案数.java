package com.tkx.java.每日一题;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月09日 8:43
 */
public class 统计打字方案数 {
    public static void main(String[] args) {
        countTexts("444479995");
    }
    public static int countTexts(String pressedKeys) {
        String s = "_" + pressedKeys;
        char[] cs = s.toCharArray();
        long[] dp = new long[s.length()];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<cs.length;i++){
            dp[i]+=dp[i-1];
            if(cs[i]==cs[i-1] && (i-2)>=0){
                dp[i]+=dp[i-2];
                if(cs[i]==cs[i-2] && (i-3)>=0){
                    dp[i]+=dp[i-3];
                    if(cs[i]==cs[i-3] && (i-4)>=0 && cs[i]=='7'){
                        dp[i]+=dp[i-4];
                    }
                }
            }
        }
        return (int)dp[dp.length-1]%1000000007;
    }
}
