package com.tkx.java.剑指offer.动态规划;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月11日 20:47
 */
public class 连续子数组的最大和 {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int ans = sum;
        for(int i=1;i<nums.length;i++){
            //如果sum<0 就取nums[i] 否则取sum+nums[i]
            sum = Math.max(nums[i],sum+nums[i]);
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
