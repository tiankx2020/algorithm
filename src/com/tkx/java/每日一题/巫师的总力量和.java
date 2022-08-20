package com.tkx.java.每日一题;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月22日 12:23
 */
public class 巫师的总力量和 {
    public int totalStrength(int[] strength) {
        long[] sum = new long[strength.length];
        int[] min = new int[strength.length];
        long ans = 0;
        for(int i=0;i<strength.length;i++){
            sum[i]+=strength[i];
            min[i] = strength[i];
            ans=ans+(sum[i]*min[i]);
        }
        for(int len=2;len<=strength.length;len++){
            for(int j=len-1,i=0;j<strength.length;j++,i++){
                sum[i]+=strength[j];
                min[i] = Math.min(min[i],strength[j]);
                ans=ans+(strength[i]*min[i]);
            }
        }
        return (int)ans;
    }
}
