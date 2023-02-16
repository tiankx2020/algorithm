package com.tkx.java.每日一题;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月24日 18:04
 */
public class T795 {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= left && nums[i] <= right) {
                int n1 = 1;
                int n2 = 1;
                int j1 = i - 1;
                int j2 = i + 1;
                while (j1>=0 && j1<nums[i]){
                    n1++;
                    j1--;
                }

                while (j2<nums.length && j2<nums[i]){
                    n2++;
                    j2++;
                }
                res+=n1*n2;
            }
        }
        return res;
    }
}
