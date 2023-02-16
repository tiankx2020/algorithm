package com.tkx.java.每日一题;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月27日 11:12
 */
public class T6248 {
    public static void main(String[] args) {
        int[] nums = {2,3,1};
        int k = 3;
        System.out.println(countSubarrays(nums, k));
    }
    // 插入排序
    public static int countSubarrays(int[] nums, int k) {
        int index = -1;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return 0;
        }
        int[] g = new int[nums.length];
        int[] l = new int[nums.length];
        for (int i = index - 1; i >= 0; i--) {
            g[i] = g[i + 1];
            l[i] = l[i + 1];
            if (nums[i] > nums[index]) {
                g[i]++;
            } else {
                l[i]++;
            }
        }
        for (int i = index + 1; i < nums.length; i++) {
            g[i] = g[i - 1];
            l[i] = l[i - 1];
            if (nums[i] > nums[index]) {
                g[i]++;
            } else {
                l[i]++;
            }
        }
        for (int i = 0; i <= index; i++) {
            for (int j = index; j < nums.length; j++) {
                if (l[i] + l[j] == g[i] + g[j] || l[i] + l[j] + 1 == g[i] + g[j]) {
                    res++;
                }
            }
        }
        return res;
    }
}
