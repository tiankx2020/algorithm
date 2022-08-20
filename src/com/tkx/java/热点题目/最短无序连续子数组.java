package com.tkx.java.热点题目;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月11日 20:59
 */
public class 最短无序连续子数组 {
    // public int findUnsortedSubarray(int[] nums) {
    //     int[] leftMax = new int[nums.length];
    //     int[] rightMin = new int[nums.length];
    //     leftMax[0] = nums[0];
    //     for(int i=1;i<nums.length;i++){
    //         leftMax[i] = Math.max(nums[i],leftMax[i-1]);
    //     }
    //     rightMin[nums.length-1] = nums[nums.length-1];
    //     for(int i=nums.length-2;i>=0;i--){
    //         rightMin[i] = Math.min(nums[i],rightMin[i+1]);
    //     }
    //     int left = -1;
    //     int right= -1;
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]>rightMin[i] || nums[i]<leftMax[i]){
    //             left = i;
    //             break;
    //         }
    //     }
    //     for(int i=nums.length-1;i>=0;i--){
    //         if(nums[i]>rightMin[i] || nums[i]<leftMax[i]){
    //             right = i;
    //             break;
    //         }
    //     }
    //     return left==right?0:(right-left)+1;
    // }

    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;

        int max = nums[0];
        int min = nums[len - 1];
        int l = 0, r = len - 1;

        for(int i = 0;  i < len; i++){
            if(max <= nums[i])
                max = nums[i];
            else
                l = i;
        }

        for(int j = len - 1; j >= 0; j--){
            if(min >= nums[j])
                min = nums[j];
            else
                r = j;
        }
        System.out.println(l);
        System.out.println(r);
        if(l == 0 && r == len - 1)
            return 0;
        return l - r + 1;
    }

}
