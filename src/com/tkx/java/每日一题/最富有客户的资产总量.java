package com.tkx.java.每日一题;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月14日 8:22
 */
public class 最富有客户的资产总量 {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (int[] account : accounts) {
            ans = Math.max(ans, Arrays.stream(account).sum());
        }
        return ans;
    }
}
