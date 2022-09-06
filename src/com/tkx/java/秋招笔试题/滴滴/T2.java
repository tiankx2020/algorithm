package com.tkx.java.秋招笔试题.滴滴;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月04日 19:47
 */
public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num1 = new int[n];
        int[] num2 = new int[n];
        int[] num3 = new int[n];
        for (int i = 0; i < n; i++) {
            num1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            num2[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            num3[i] = scanner.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int one = num1[i];
            int two = num2[i];
            int three = num3[i];
            int temp = 0;
            for (int j = one; j <= two; j++) {
                if (map.containsKey(j)) {
                    if (map.get(j) == three) {
                        temp++;
                    }
                } else {
                    int cur = beauty(j);
                    if (cur == three) {
                        temp++;
                    }
                    map.put(j, cur);
                }
            }
            res[i] = temp;
        }
        for (int i = 0; i < res.length; i++) {
            if (i == res.length - 1) {
                System.out.print(res[i]);
            } else {
                System.out.print(res[i] + " ");
            }
        }
    }

    private static int beauty(int j) {
        if (j < 10) { // 0的美丽值1
            return 0 ^ j;
        }
        String str = String.valueOf(j);
        int res = str.charAt(0) - 48;
        while (j > 10) {
            res = res ^ (j % 10);
            j /= 10;
        }
        return res;
    }
}
