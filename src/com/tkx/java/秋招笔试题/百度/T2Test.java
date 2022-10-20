package com.tkx.java.秋招笔试题.百度;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月20日 20:28
 */
public class T2Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextLong();
        }
        int left = 0;
        int right = n - 1;
        long res = 0;
        while (left < right) {
            // 只用保证前一半
            if (left + 1 == right && nums[left + 1] != nums[right]) {
                System.out.println(-1);
                return;
            }
            if (nums[left] < nums[right]) {
                long cha = nums[right] - nums[left];
                nums[left] += cha;
                nums[left + 1] += cha;
                res += cha;
            } else if (nums[left] > nums[right]) {
                long cha = nums[left] - nums[right];
                nums[right] += cha;
                nums[right - 1] += cha;
                res += cha;
            }
            left++;
            right--;
        }
        System.out.println(res);
    }
}
