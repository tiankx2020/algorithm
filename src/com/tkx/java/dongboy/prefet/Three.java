package com.tkx.java.dongboy.prefet;

import java.util.Scanner;

/**
 * @author dong boy
 * @date 2022年08月28日 11:21
 */
public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] num1 = new int[N + 2];
        int[] num2 = new int[N + 2];
        int[] num3 = new int[N + 2];
        int[] num4 = new int[N + 2];
        for (int i = 1; i <= N; i++)
            num1[i] = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            num2[i] = Math.max(num2[i - 1], 0) + num1[i];
            num3[i] = Math.max(num3[i - 1], num2[i]);
        }
        for (int i = N; i >= 1; i--) {
            num2[i] = Math.max(num2[i + 1], 0) + num1[i];
            num4[i] = Math.max(num4[i + 1], num2[i]);
        }
        int res = num3[N];
        for (int i = 1; i < N; i++)
            res = Math.max(res, num3[i] + num4[i + 1]);
        System.out.println(res);
    }
}
