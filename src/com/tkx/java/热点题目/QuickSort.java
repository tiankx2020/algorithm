package com.tkx.java.热点题目;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description: 快速排序
 * @author: scott
 * @date: 2022年03月31日 14:02
 */
public class QuickSort {
    public static int[] arr;
    public static void main(String[] args) {
        Random r = new Random();
        arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(50);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------");
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static  void quickSort(int[] nums,int left,int right){
        if(left>=right) return;
        int l=left,r=right;
        int temp = nums[left];
        while(r>l){
            while(r>l && nums[r]>=temp) r--;
            while(r>l && nums[l]<=temp) l++;
            int t = nums[r];
            nums[r] = nums[l];
            nums[l] = t;
        }
        nums[left] = nums[l];
        nums[l] = temp;
        quickSort(nums,left,l-1);
        quickSort(nums,l+1,right);
    }
}
