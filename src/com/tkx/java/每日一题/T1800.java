package com.tkx.java.每日一题;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月08日 11:21
 */
public class T1800 {
    public int maxAscendingSum(int[] nums) {
        int[] dpNum = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            dpNum[i]+=nums[i];
            if(i-1>=0 && nums[i]>nums[i-1]){
                dpNum[i]+=dpNum[i-1];
            }
        }
        return Arrays.stream(dpNum).max().getAsInt();
    }
}
