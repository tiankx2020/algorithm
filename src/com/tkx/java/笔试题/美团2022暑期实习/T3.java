package com.tkx.java.笔试题.美团2022暑期实习;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月23日 16:56
 */
public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int[] arr = new int[k];
            int[] color = new int[k];
            for (int j = 0; j < k; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j = 0; j < k; j++) {
                color[j] = sc.nextInt();
            }
            method(arr, color);
        }
    }

    public static void method(int[] arr, int[] color) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    if (color[j] == color[j + 1]) {
                        System.out.println("NO");
                        return;
                    } else {
                        int tmp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = tmp;

                         tmp = color[j+1];
                        color[j+1]=color[j];
                        color[j] = tmp;
                    }
                }
            }
        }
        System.out.println("YES");
    }
}
