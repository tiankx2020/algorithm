package com.tkx.java.dongboy.prefet;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
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
        for(int i = 1; i <= t; i++){
            int n = scanner.nextInt();
            scanner.nextLine();
            String str = scanner.nextLine();
            String[] s = str.split(" ");
            list.add(maxProduct(s));
        }
        for(int[] data : list){
            System.out.println(data[0] + " " + data[1]);
        }
    }

    public static int[] maxProduct(String[] s) {
        int[] res = new int[2];
        int n = s.length;
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(s[i]);
        }
        // 双指针
        int left = 0,right = 0;
        int max = 0;
        int temp = 1;
        while(right < n){
            if(nums[right] != 0){ // 不为0，把right乘进去
                temp *= nums[right];
                if(temp > max){ // 如果更大，就更新起始坐标
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
        return res;
    }
}
