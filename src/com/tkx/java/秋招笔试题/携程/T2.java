package com.tkx.java.秋招笔试题.携程;

import java.util.Scanner;


public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int y = nums[i][0];
            int o = nums[i][1];
            int u = nums[i][2];
            /**
             * 思路 y , o , u 三个数量中的最小的 + max(o-min,0)
             */
            int min = Math.min(y,Math.min(o,u));
            res[i] = min*2 +Math.max(o-min-1,0);
        }
        for (int re : res) {
            System.out.println(re);
        }

    }
}
