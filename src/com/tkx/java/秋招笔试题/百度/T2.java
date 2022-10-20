package com.tkx.java.秋招笔试题.百度;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月20日 19:39
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }
        if (n == 1) {
            System.out.println(0);
            return;
        }
        if (n == 2) {
            if (arr[0] != arr[1]) {
                System.out.println(-1);
                return;
            } else {
                System.out.println(0);
                return;
            }
        }
        long res = 0;
        int left, right;
        if (n % 2 == 0) {
            left = n / 2 - 1;
            right = n / 2;

        } else {
            left = n / 2 - 1;
            right = n / 2 + 1;
            res = Math.abs(arr[left] - arr[right]);
            arr[right] = Math.max(arr[right], arr[left]);
            arr[left] = arr[right];
            if(left>=1){
                arr[left-1] = Math.max(arr[left-1],arr[right+1]);
                arr[right+1] = arr[left-1];
            }
        }
        while (left >= 1) {
            if (arr[left] - arr[left - 1] != arr[right] - arr[right + 1]) {
                System.out.println(-1);
                return;
            } else {
                res += Math.abs(arr[left-1] - arr[right+1]);
                arr[left] = Math.max(arr[left], arr[right]);
                arr[right] = arr[left];
                arr[left - 1] = Math.max(arr[left - 1], arr[right + 1]);
                arr[right + 1] = arr[left - 1];
            }
            left--;
            right++;
        }
        System.out.println(res);
    }
}
