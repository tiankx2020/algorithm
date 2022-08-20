package com.tkx.java.热点题目;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月10日 21:45
 */
public class 手写堆排序 {
    public static void main(String[] args) {
        Random r =  new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static  void heapSort(int[] arr){
        //1.第一步 建堆
        for(int i=arr.length/2-1;i>=0;i--){
            adjustHeap(arr,i,arr.length);
        }

        //2.第二部调整堆
        for(int j = arr.length-1;j>0;j--){
            swap(arr,0,j);
            adjustHeap(arr,0,j);
        }
    }

    public static void adjustHeap(int[] arr, int i,int length){
        int tmp = arr[i];
        for(int k=2*i+1;k<length;k=2*i+1){
            if(k+1<length && arr[k+1]>arr[k]) k++;
            if(arr[k]>tmp){
                arr[i]= arr[k];
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
