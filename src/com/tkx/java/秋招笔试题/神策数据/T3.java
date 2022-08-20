package com.tkx.java.秋招笔试题.神策数据;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // A和B的和等于nums[A] - A + nums[B] + B
        // 当前为止的最大股价和当前天数之和
        int maxPrice = 0;
        // 当前为止的最大结果
        int res = 0;
        //
        for (int i = 0; i < n; i++) {
            res = Math.max(res,nums[i] - (i + 1) + maxPrice);
            if(nums[i] + (i + 1) > maxPrice){
                maxPrice = nums[i] + (i + 1);
            }
        }
        System.out.println(res);
    }
}
