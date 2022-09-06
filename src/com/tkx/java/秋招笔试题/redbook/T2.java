package com.tkx.java.秋招笔试题.redbook;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月04日 16:39
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long count = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int t1 = Math.min(Math.abs(arr[i] - 7), Math.abs(arr[i] + 7));
            int t2 = Math.min(Math.abs(arr[index] - 7), Math.abs(arr[index] + 7));
            if (t1 < t2) {
                index = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                count += Math.min(Math.abs(arr[i] - 1), Math.abs(arr[i] + 1));
            } else {
                count += Math.min(Math.abs(arr[index] - 7), Math.abs(arr[index] + 7));
            }
        }

        System.out.println(count);
    }
}
