package com.tkx.java.排序;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月03日 14:23
 */
public class 直接插入排序 {

    public static void main(String[] args) {
        int[] arr = new int[30];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int[] arr){
        int i,j;
        for(i=1;i<arr.length;i++){
            int tmp = arr[i];
            for(j=i-1;j>=0;j--){
                if(arr[j]>tmp) arr[j+1] = arr[j];
                else{
                    break;
                }
            }
            arr[j+1] = tmp;

        }
    }
}
