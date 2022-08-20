package com.tkx.java.排序;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月13日 14:13
 */
public class 堆排序Demo {
    public static void main(String[] args) {
        int[] arr = new int[25];
        Random r = new Random();
        for (int i = 0; i < 25; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void heapSort(int[] arr){
        for(int i=arr.length/2-1;i>=0;i--){
            adjust(arr,i,arr.length);
        }

        for(int j=arr.length-1;j>0;j--){
            swap(arr,0,j);
            adjust(arr,0,j);
        }
    }


    public static void adjust(int[] arr ,int i,int length){
        int tmp = arr[i];
        for(int k=2*i+1;k<length;k=2*i+1){
            if(k+1<length && arr[k+1]>arr[k]) k++;
            if(arr[k]>tmp){
                arr[i] = arr[k];
                i=k;
            }else{
                break;
            }
        }
        arr[i] = tmp;
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] =tmp;
    }
}
