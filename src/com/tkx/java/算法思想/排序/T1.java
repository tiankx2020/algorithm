package com.tkx.java.算法思想.排序;

import java.util.Random;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月13日 11:32
 */
public class T1 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        int[] arr = new int[20];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        t1.heapSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }


    public void heapSort(int[] arr){
        // 初始化堆
        for(int i=arr.length/2-1;i>=0;i--){
            adjustHeap(arr,i,arr.length);
        }

        for(int j=arr.length-1;j>=0;j--){
            swap(arr,0,j);
            adjustHeap(arr,0,j);
        }
    }

    public void swap(int[] arr, int i, int j) {
         int tmp = arr[i];
         arr[i] = arr[j];
         arr[j] = tmp;
    }

    public  void adjustHeap(int[] arr, int i, int length) {
        // 去需要进行比较的节点
        int tmp = arr[i];
        for(int k=2*i+1;k<length;k=2*i+1){
            // 去左右子节点中较大的一个
            if(k+1<length && arr[k+1]>arr[k]) k++;
            if(arr[k]>tmp){
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = tmp;
    }
}
