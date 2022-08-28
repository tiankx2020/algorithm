package com.tkx.java.dongboy.prefet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author dong boy
 * @date 2022年08月27日 14:40
 */
public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        // 把结果放在容器
        List<int[]> list = new ArrayList<>();
        for (int x = 1; x <= t; x++) {
            int n = scanner.nextInt();
            int[] res = new int[2]; // 当前结果
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = scanner.nextInt();
            }
            int left = 0, right = 0;
            int max = 0;
            int temp = 1;
            while (right < n) {
                if (nums[right] != 0) { // 不为0，把right乘进去
                    temp *= nums[right];
                    if (temp > max) { // 如果更大，就更新起始坐标
                        max = temp;
                        res[0] = left + 1;
                        res[1] = right + 1;
                    }
                    right++;
                } else { // 为0，更新起始坐标
                    right++;
                    left = right;
                    temp = 1;
                }
            }
            list.add(res);
        }
        for (int[] data : list) {
            System.out.println(data[0] + " " + data[1]);
        }
    }
}
