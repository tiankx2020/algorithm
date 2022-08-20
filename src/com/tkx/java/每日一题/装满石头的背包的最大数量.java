package com.tkx.java.每日一题;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月22日 12:16
 */
public class 装满石头的背包的最大数量 {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        for(int i=0;i<capacity.length;i++){
            capacity[i]-=rocks[i];
        }
        Arrays.sort(capacity);
        int ans = 0;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]-additionalRocks<=0){
                additionalRocks-=capacity[i];
                ans++;
            }else{
                break;
            }
        }
        return ans;
    }
}
