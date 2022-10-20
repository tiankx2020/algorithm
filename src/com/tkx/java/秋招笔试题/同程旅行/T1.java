package com.tkx.java.秋招笔试题.同程旅行;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月14日 19:51
 */
public class T1 {
    public int maxProfit(int[] prices) {
        int res = 0;
        int p = prices[0];
        int len = prices.length;
        for(int i=0;i<len;i++){
            if(prices[i]> p){
                res+=prices[i]- p;
            }
            p =prices[i];
        }
        return res;
    }
}
