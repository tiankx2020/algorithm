package com.tkx.java.leecodeHot100;

/**
 * 所用方法:双指针
 * 思想：一个快指针j,如果nums[j] != nums[j-1] 说明出现了新的值，需要记录使nums[++i] = nums[j]
 * 返回 i+1;
 * 时间复杂度：O(N)
 * 空间复杂度: O(1)
 */
public class _26删除有序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[j-1]){
                nums[++i]=nums[j];
            }
        }
        return i+1;
    }
}
