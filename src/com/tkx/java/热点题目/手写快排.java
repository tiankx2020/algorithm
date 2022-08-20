package com.tkx.java.热点题目;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月10日 21:35
 */
public class 手写快排 {

    public static void main(String[] args) {
        int[] arr = new int[30];
        Random r= new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr ,int left,int right){
        if(left>=right) return;
        int l =left,r=right;
        int tmp = arr[left];
        while(l<r){
            while (l<r && arr[r]>=tmp) r--;
            while (l<r && arr[l]<=tmp) l++;
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
        }
        arr[left] = arr[l];
        arr[l] = tmp;
        quickSort(arr,left,l-1);
        quickSort(arr,l+1,right);
    }
}
