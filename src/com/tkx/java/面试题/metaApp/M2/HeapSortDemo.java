package com.tkx.java.面试题.metaApp.M2;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月16日 16:06
 */
public class HeapSortDemo {
    public static void main(String[] args) {
        int[] arr = new int[30];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------");
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr){
        //建堆
        for(int i=arr.length/2-1;i>=0;i--){
            adjust(arr,i,arr.length);
        }
        //调整
        for(int j= arr.length-1;j>0;j--){
            swap(arr,0,j);
            adjust(arr,0,j);
        }
    }

    public static void adjust(int[] arr,int i,int len){
        int tmp = arr[i];
        for(int k=2*i+1;k<len;k=2*i+1){
            if(k+1<len && arr[k+1]>arr[k]) k++;
            if(arr[k]>tmp){
                arr[i] = arr[k];
                i=k;
            }else{
                break;
            }
        }
        arr[i] = tmp;
    }

    public static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
