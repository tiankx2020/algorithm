package com.tkx.java.代码随想录.数组;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月15日 21:57
 */
public class Leecode283 {
    public void moveZeroes(int[] nums) {
        int lowIndex,fastIndex;
        for(lowIndex=0,fastIndex=0;fastIndex<nums.length;fastIndex++){
            if(nums[fastIndex]!=0){
                nums[lowIndex++] = nums[fastIndex];
            }
        }
        for(int i=lowIndex;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
