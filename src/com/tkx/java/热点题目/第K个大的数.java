package com.tkx.java.热点题目;


import java.util.Random;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月01日 19:09
 */
public class 第K个大的数 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        第K个大的数 k = new 第K个大的数();
        k.findKthLargest(arr,2);
    }
    /**
     * 第一步：写出一个方法(核心方法)partition,找到pivot的位置，
     * 并将pivot小的元素移到前面去，比它大的元素一道后面数
     * 并返回这个元素的下标
     **/
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int left = 0,right = len-1;
        int target = left-k;
        while(true){
            int index = partition(nums,left,right);
            if(index==target){
                return nums[index];
            }
            //说明要找的元素在前面
            if(index>target){
                right=index-1;
            }else{
                left = index+1;
            }
        }
    }

    public int partition(int[] nums,int left,int right){
        int temp = nums[left];
        int l=left,r=right;
        while(l<r){
            while(l<r && nums[r]>=temp) r--;
            while(l<r && nums[l]<=temp) l++;
            int t= nums[l];
            nums[l] = nums[r];
            nums[r] =t;
        }
        nums[left] = nums[l];
        nums[l] = temp;
        return l;
    }




}
