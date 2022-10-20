package com.tkx.java.秋招笔试题.蚂蚁;

import java.util.Scanner;
public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int k = scanner.nextInt();
        int length = String.valueOf(k).length();
        long res = 0;
        // 初始两个指针保持0的距离
        int left  = 0;
        int right = 1;
        // 以right结尾的数字的数字串是否小于k
        while (right <= input.length()){
            String cur = input.substring(left,right);
            if(cur.length() < length){
                res = res + (right - left);
                right++;
            } else {
                int num = Integer.parseInt(cur);
                if(num < k){
                    res = res + (right - left);
                    right++;
                } else {
                    left++;
                }
            }
        }
        System.out.println(res);
    }
}
