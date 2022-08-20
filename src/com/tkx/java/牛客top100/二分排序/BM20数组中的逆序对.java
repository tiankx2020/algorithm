package com.tkx.java.牛客top100.二分排序;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月18日 21:46
 */
public class BM20数组中的逆序对 {
    long ans = 0;
    public int InversePairs(int[] array) {
        mergeSort(array,0,array.length-1);
        return (int)(ans%1000000007);
    }
    public  void mergeSort(int[] array, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    public  void merge(int[] array, int left, int mid, int right) {
        int[] tmp = new int[array.length];
        int index = left;
        int i = left, j = mid + 1;
        while (i <= mid && j <= right) {
            if(array[i]<=array[j]){
                tmp[index++] = array[i++];
            }else{
                ans+=(mid-i)+1;
                tmp[index++] = array[j++];
            }
        }
        while(i<=mid) tmp[index++] = array[i++];
        while (j<=right) tmp[index++] = array[j++];
        for(int k=left;k<index;k++){
            array[k] = tmp[k];
        }
    }
}
