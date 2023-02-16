package com.tkx.java.每日一题;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月24日 14:28
 */
public class T915 {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        // 从左到右的最大值
        int[] left = new int[n];
        // 从右到左的最大值
        int[] right = new int[n];
        left[0] = nums[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(nums[i], left[i - 1]);
        }
        right[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.min(right[i - 1], nums[i]);
        }
        for (int i = 0; i < nums.length-1; i++) {
            if(left[i]<=right[i+1]){
                return i+1;
            }
        }
        return -1;
    }
}
