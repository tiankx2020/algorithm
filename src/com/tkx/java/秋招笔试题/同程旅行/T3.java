package com.tkx.java.秋招笔试题.同程旅行;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月14日 21:19
 */
public class T3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        long res = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] <= nums[i - 1]){
                while (nums[i] <= nums[i - 1]){
                    nums[i] *= 2;
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
