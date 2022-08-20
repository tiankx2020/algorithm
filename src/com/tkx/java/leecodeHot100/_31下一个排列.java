package com.tkx.java.leecodeHot100;

import java.util.Arrays;

/**

    思路：从后往前遍历,比如说nums[i] 从nums[i+1,...]中能够找到一个比nums[i]大的数，就可以进行交换
    并且是比nums[i]大且最小的数,没有找到的话，直接排序返回

    时间复杂度：O(N2)
    空间复杂度: O(1)
 */
public class _31下一个排列 {
    public void nextPermutation(int[] nums) {
        for(int i=nums.length-2;i>=0;i++){
            int index = -1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    if(index==-1 || nums[j]<nums[index]){
                        index = j;
                    }
                }
            }
            if(index!=-1){
                int t = nums[i];
                nums[i] = nums[index];
                nums[index]  = t;
                Arrays.sort(nums,i+1,nums.length);
                return;
            }
        }
        Arrays.sort(nums);
    }
}
