package com.tkx.java.热点题目;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月10日 21:39
 */
public class 手写归并 {

    public static void main(String[] args) {
        Random r =  new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr,int left,int right){
        if(left>=right) return;
        int mid = (left+right)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    public  static  void merge(int[] arr,int left,int mid ,int right){
        int[] tmp = new int[right-left+1];
        int i =left,j = mid+1;
        int index  = 0;
        while (i<=mid && j <=right){
            if(arr[i]<arr[j]){
                tmp[index++] = arr[i++];
            }else{
                tmp[index++] = arr[j++];
            }
        }
        while(i<=mid) tmp[index++] = arr[i++];
        while(j<=right) tmp[index++] = arr[j++];
        for(int k=0;k<tmp.length;k++){
            arr[k+left] = tmp[k];
        }
    }
}
