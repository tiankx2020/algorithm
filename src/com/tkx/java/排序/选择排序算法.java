package com.tkx.java.排序;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月03日 14:26
 */
public class 选择排序算法 {
    public static void main(String[] args) {
        int[] arr= new int[30];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectSort(int[] arr){
        // for(int i=arr.length-1;i>=0;i--){
        //     int index = 0;
        //     for(int j=0;j<i+1;j++){
        //         if(arr[j]>arr[index]){
        //             index = j;
        //         }
        //     }
        //     int tmp = arr[index];
        //     arr[index] = arr[i];
        //     arr[i] = tmp;
        // }
        for(int i=0;i<arr.length-1;i++){
            int index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }
    }
}
