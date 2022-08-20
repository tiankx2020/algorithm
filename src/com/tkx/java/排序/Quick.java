package com.tkx.java.排序;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月06日 21:29
 */
public class Quick {
    public static void main(String[] args) {
        int[] arr= new int[30];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int tmp = nums[left];
        int l = left, r = right;
        while (l < r) {
            while (l < r && nums[r] <= tmp) r--;
            while (l < r && nums[l] >= tmp) l++;
            int t = nums[l];
            nums[l] = nums[r];
            nums[r] = t;
        }
        nums[left] = nums[l];
        nums[l] = tmp;
        quickSort(nums,left,l-1);
        quickSort(nums,l+1,right);
    }
}
