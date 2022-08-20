package com.tkx.java.牛客top100.二分排序;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月18日 21:34
 */
public class BM19寻找峰值 {
    public int findPeakElement(int[] nums) {
        // write code here
        int n = nums.length;
        int l = 0 ;
        int r = n - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            //
            if (nums[mid] < nums[mid + 1]) {
                l = mid + 1;
            } else {
                // 发现了前面的不比后面小，那么就可以确定有波峰的存在，压缩后半段区间
                r = mid;
            }
        }
        return l;
    }
}
