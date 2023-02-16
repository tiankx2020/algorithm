package com.tkx.java.秋招笔试题.微盟;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月03日 14:11
 */
public class TopK {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        int k = 5;
        int left =0,right=arr.length-1;
        while (true){
            int idx = quickSort(arr,left,right);
            if(idx==k) break;
            else if(idx>k) right=idx-1;
            else  left = idx+1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //寻找第k的元素
    public static int quickSort(int[] arr,int left,int right){
        int tmp = arr[left];
        int l=left,r=right;
        while(l<r){
            while (l<r && arr[r]>=tmp) r--;
            while (l<r && arr[l]<=tmp) l++;
            int t = arr[l];
            arr[l] =arr[r];
            arr[r] =t;
        }
        arr[left] = arr[l];
        arr[l] = tmp;
        return l;
    }
}
