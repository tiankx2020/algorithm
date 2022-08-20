package com.tkx.java.代码随想录.数组;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月15日 21:45
 */
public class leecode26 {
    public int removeDuplicates(int[] nums) {
        int lowIndex,fastIndex;
        for(lowIndex=0,fastIndex=1;fastIndex<nums.length;fastIndex++){
            if(nums[lowIndex]!=nums[fastIndex]){
                nums[++lowIndex] = nums[fastIndex];
            }
        }
        return lowIndex+1;
    }
}
