package com.tkx.java.leecodeHot100;

/**
 * 所用思想：双指针
 * 方法：指针i记录有效元素，指针j进行迭代
 * 时间复杂度：O(N)
 * 空间复杂度:O(1)
 */
public class _27移除元素 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
