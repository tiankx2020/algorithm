package com.tkx.java.leecode周赛.D391;

import java.util.Arrays;

/**
 * @Author tkx
 * @Date 2024 03 31
 **/
public class T3 {

    public long countAlternatingSubarrays(int[] nums) {
        long res = 0;
        int[] dp = new int[nums.length];
        for (int i=0;i< nums.length-1;i++) {
            if(nums[i]!=nums[i+1]){
                dp[i+1]=dp[i]+1;
            }else{
                dp[i+1]=1;
            }
        }
        for(int i=0;i< dp.length;i++) res+=dp[i];
        return res;
    }
}
