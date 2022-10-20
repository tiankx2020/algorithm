package com.tkx.java.算法思想.排序;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月13日 11:31
 */
public class HeapSortMain {
    // 堆排序
    public void heapSort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }
        for (int j = arr.length - 1; j >= 0; j--) {
            swap(arr,0,j);
            adjustHeap(arr,0,j);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i]= arr[j];
        arr[j] = tmp;
    }

    private void adjustHeap(int[] arr, int i, int length) {
        int tmp = arr[i];
        for (int k = 2 * i + 1; k < length; k = 2 * i + 1) {
            if (k + 1 < length && arr[k + 1] > arr[k]) k++;
            if (arr[k] > tmp) {
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }
        arr[i] = tmp;
    }
}
