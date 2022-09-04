package com.tkx.java.dongboy.xhs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author dong boy
 * @date 2022年09月04日 17:31
 */
public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        if(n < 2){
            System.out.println(Math.abs(nums[0] - 7));
            return;
        }
        Arrays.sort(nums);
        // 先把所有负数变正数
        for(int i = 1; i < n; i += 2){
            if(nums[i] < 0){
                nums[i] = -nums[i];
                nums[i - 1] = -nums[i - 1];
            } else {
                break;
            }
        }
        Arrays.sort(nums);
        int res = 0;
        // 一个7，其余的都是1
        for(int i = 0;  i < n - 1; i++){
            res += Math.abs(nums[i] - 1);
        }
        res += Math.abs(nums[n - 1] - 7);
        System.out.println(res);
    }
}
