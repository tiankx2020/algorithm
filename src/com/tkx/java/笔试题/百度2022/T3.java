package com.tkx.java.笔试题.百度2022;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月19日 19:30
 */
public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, p;
        n = sc.nextInt();
        p = sc.nextInt();
        int[] arr = new int[n];
        boolean[] f = new boolean[n];
        long ans = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        f[0] = true;
        int index = 0;
        for (; index < n - 1; index++) {
            if (arr[index + 1] <= arr[index]) {
                f[index + 1] = true;
            } else {
                break;
            }
        }
        while (true) {
            int next = index;
            for (int i = 0; i < n; i++) {
                if (f[i] == false && arr[i] > arr[next]) {
                    next = i;
                }
            }
            if (Math.abs(next - index) <= 1) {
                ans += Math.min(p, Math.abs(arr[next] - arr[index]));
            }
            int tmp = 0;
            for (int i = 0; i < n; i++) {
                if (f[i] == true) tmp++;
            }
            if (tmp == n) break;
        }


        System.out.println(ans);

    }
}
