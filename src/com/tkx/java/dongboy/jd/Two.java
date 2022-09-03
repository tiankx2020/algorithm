package com.tkx.java.dongboy.jd;

import java.util.Scanner;

/**
 * @author dong boy
 * @date 2022年09月03日 19:39
 */
public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int[] dp = new int[100001]; // dp[i]表示i变为1需要的最少次数
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 2;
        for (int i = 4; i <= 10000; i++) {
            if (isPrime(i)) { // 是否是质数
                dp[i] = 1 + dp[1] + dp[i - 1];
            } else {
                int a = (int) Math.floor(Math.sqrt(i));
                int b = i / a;
                dp[i] = 1 + Math.min(dp[1] + dp[i - 1], dp[a] + dp[b]);
            }
        }
        long res = 0;
        for (int data : nums) {
            res = res + (long) dp[data];
        }
        System.out.println(res);
    }

    //是否是质数
    public static boolean isPrime(int num) {
        if (num <= 1 || num > 2 && num % 2 == 0) {
            return false;
        } else if (num == 2) {
            return true;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
