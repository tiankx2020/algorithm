package com.tkx.java.leecodeHot100;

/**
 */
public class _34在排序数组中查找元素的第一个和最后一个位置 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        searchRange(nums,target);
    }
    public static int[] searchRange(int[] nums, int target) {
        int l = -1, r = nums.length;
        int left;
        int right;
        // 找到第一个等于target的下标 r
        while (l + 1 != r) {
            int mid = (l + r) / 2;
            if (nums[mid] < target) {
                l = mid;
            } else {
                r = mid;
            }
        }
        left = r;
        if (r == nums.length || nums[r]!=target) return new int[]{-1, -1};
        // 找到最后一个等于target的下标
        l = -1;
        r = nums.length;
        while (l + 1 != r) {
            int mid = (l + r) / 2;
            if (nums[mid] <= target) {
                l = mid;
            } else {
                r = mid;
            }
        }
        right = l;
        return  new int[]{left,right};
    }

}
