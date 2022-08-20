package com.tkx.java.排序Test;

import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * author: scott
 * date: 2022年08月12日 21:56
 */
public class MyTest {


    @Test
    public void method() {
        Random r = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println("before:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        heapSort(arr);
        System.out.println("after:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


    public void bubbleSort(int[] arr) {
        System.out.println("冒泡排序:");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public void insertSort(int[] arr) {
        System.out.println("插入排序:");
        int i, j;
        for (i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;
        }
    }

    public void selectSort(int[] arr) {
        System.out.println("选择排序");
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;
        }
    }


    public void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int tmp = arr[left];
        int l = left;
        int r = right;
        while (l < r) {
            while (l < r && arr[r] >= tmp) r--;
            while (l < r && arr[l] <= tmp) l++;
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
        }
        arr[left] = arr[l];
        arr[l] = tmp;
        quickSort(arr, left, l - 1);
        quickSort(arr, l + 1, right);
    }

    /**
     * 归并排序
     *
     * @param arr
     * @param left
     * @param right
     */
    public void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        int i = left, j = mid + 1;
        int index = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                tmp[index++] = arr[i++];
            } else {
                tmp[index++] = arr[j++];
            }
        }
        while (i <= mid) tmp[index++] = arr[i++];
        while (j <= right) tmp[index++] = arr[j++];
        for (int k = 0; k < tmp.length; k++) {
            arr[left + k] = tmp[k];
        }
    }

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
