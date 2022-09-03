package com.tkx.java.dongboy.xiecheng;

import java.lang.annotation.Native;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author dong boy
 * @date 2022年08月30日 19:37
 */
public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int[] temp = new int[n]; //当前位置的最大绝对值
        int max = 0; // 最大平滑值
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (i - 1 >= 0) {
                temp[i] = Math.max(temp[i], Math.abs(nums[i] - nums[i - 1]));
            }
            if (i + 1 < n) {
                temp[i] = Math.max(temp[i], Math.abs(nums[i] - nums[i + 1]));
            }
            if (temp[i] > max) {
                max = temp[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println(0);
            return;
        }
        // 找到index的位置后，修改它的值，使得最小
        if(index == 0 || index == n - 1){
            nums[index] = index == 0 ? nums[index + 1] : nums[n - 2];
            System.out.println(method(nums));
        } else {
            // 这里只看了左边的最大值
            int t = nums[index];
            nums[index] = (nums[index - 1] + nums[index + 1]) / 2;
            int x1 = method(nums);
            // 考虑右边的最大值
            nums[index] = t; // 还原
            index++;
            if(index == n - 1) {
                nums[index] = nums[n - 2];
            } else {
                nums[index] = (nums[index - 1] + nums[index + 1]) / 2;
            }
            int x2 = method(nums);
            System.out.println(Math.min(x1,x2));
        }
    }
    private static int method(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if (i - 1 >= 0) {
                res[i] = Math.max(res[i], Math.abs(nums[i] - nums[i - 1]));
            }
            if (i + 1 < n) {
                res[i] = Math.max(res[i], Math.abs(nums[i] - nums[i + 1]));
            }
            if(res[i] > ans){
                ans = res[i];
            }
        }
        return ans;
    }
}