package com.tkx.java.每日一题;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月22日 12:04
 */
public class 表示一个折线图的最少线段数 {
    public int minimumLines(int[][] stockPrices) {
        int ans = 1;
        if (stockPrices.length == 1) return 0;
        if (stockPrices.length == 2) return 1;
        Arrays.sort(stockPrices,(a,b)->a[0]-b[0]);
        for (int i = 2; i < stockPrices.length; i++) {
            int a1 = stockPrices[i - 2][0];
            int a2 = stockPrices[i - 2][1];
            int b1 = stockPrices[i - 1][0];
            int b2 = stockPrices[i - 1][1];
            int c1 = stockPrices[i][0];
            int c2 = stockPrices[i][1];
            if((b2-a2)*(c1-b1) != (c2-b2)*(b1-a1)) ans++;
         }
        return ans;
    }
}
