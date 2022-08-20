package com.tkx.java.牛客top100.二分排序;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月18日 8:58
 */
public class BM17二分查找I {
    public int search (int[] nums, int target) {
        // write code here
        int left=0,right= nums.length-1;
        while(left<right){
            int mid = (left+right)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid]>target){
                right = mid-1;
            }else {
                left = mid+1;
            }

        }
        return  -1;
    }
}
