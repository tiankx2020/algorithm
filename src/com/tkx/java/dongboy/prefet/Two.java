package com.tkx.java.dongboy.prefet;

import java.util.Scanner;

/**
 * @author dong boy
 * @date 2022年08月28日 11:21
 */
public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] nums = new int[N];
        for(int i = 0; i < N; i++){
            nums[i] = scanner.nextInt();
        }
        System.out.println(maximumSum(nums));
    }

    // 传入输入的数组
    public static int maximumSum(int[] nums) {
        int a = nums[0], b = 0, res = a;
        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            if (cur >= 0) {
                a = Math.max(0, a) + cur;
                b = b + cur;
            } else {
                b = Math.max(a, b + cur);
                a = Math.max(0, a) + cur;
            }
            res = Math.max(res, a);
            res = Math.max(res, b);
        }
        return res;
    }
}
