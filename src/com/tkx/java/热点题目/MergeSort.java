package com.tkx.java.热点题目;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description: 归并排序
 * @author: scott
 * @date: 2022年03月31日 14:09
 */
public class MergeSort {
    public static int[] arr;
    public static void main(String[] args) {
        arr= new int[30];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(50);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------------");
        mergeSort(arr,0, arr.length -1);
        System.out.println(Arrays.toString(arr));

    }

    public static void mergeSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    public static void merge(int[] nums, int left, int mid, int right) {
        int l1 = left, l2 = mid + 1;
        // int[] arr = new int[nums.length];
        int[] arr = new int[right-left+1];
        int index = 0;
        while (l1 <= mid && l2 <= right) {
            if (nums[l1] < nums[l2]) {
                arr[index++] = nums[l1++];
            } else {
                arr[index++] = nums[l2++];
            }
        }
        while (l1 <= mid) arr[index++] = nums[l1++];
        while (l2 <= right) arr[index++] = nums[l2++];
        for(int i=left;i<=right;i++){
            nums[i] = arr[i-left];
        }
    }

}
