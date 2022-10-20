package com.tkx.java.秋招笔试题.中信信用卡;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月22日 16:14
 */
public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 上下翻卷
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int[] tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }

        // 左右翻卷
        i = 0;
        j = arr[0].length - 1;
        while (i < j) {
            for (int k = 0; k < n; k++) {
                int tmp = arr[k][i];
                arr[k][i] = arr[k][j];
                arr[k][j] = tmp;
            }
            i++;
            j--;
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println("");
        }
    }
}
