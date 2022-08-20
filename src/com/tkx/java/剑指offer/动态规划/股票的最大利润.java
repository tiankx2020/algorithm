package com.tkx.java.剑指offer.动态规划;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月11日 21:17
 */
public class 股票的最大利润 {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int min = prices[0];
        for(int i=1;i<prices.length;i++){
            ans = Math.max(ans,prices[i]-min);
            min = Math.min(min,prices[i]);
        }
        return  ans;
    }
}
