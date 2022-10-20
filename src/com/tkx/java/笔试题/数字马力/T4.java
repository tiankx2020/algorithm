package com.tkx.java.笔试题.数字马力;

import java.util.Random;
import java.util.Scanner;

/**
 * 归并排序
 */
public class T4 {


    static long res = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(res % 1000000007);
    }

    public static void mergeSort(long[] arr, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(long[] arr, int left, int mid, int right) {
        if (right - left + 1 <= 1) return;
        long[] tmp = new long[right - left + 1];
        int i = left, j = mid + 1;
        int index = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                res = res + arr[i] * (right - j + 1);
                res %= 1000000007;
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
}
