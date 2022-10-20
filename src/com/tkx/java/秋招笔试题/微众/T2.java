package com.tkx.java.秋招笔试题.微众;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月13日 21:03
 */
public class T2 {
    static int step = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] arr = new long[n][2];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = sc.nextLong();
            arr[i][1] = sc.nextLong();
        }
        for (int i = 0; i < arr.length; i++) {
            step = 0;
            long t1 = arr[i][0];
            long t2 = arr[i][1];
            int step1 = 0;
            int step2 = 0;
            while (t1 != 1) {
                if (t1 % 2 == 0) t1 /= 2;
                else break;
                step1++;
            }
            while (t2 != 1) {
                if (t2 % 2 == 0) t2 /= 2;
                else break;
                step2++;
            }
            if (t1 != t2) {
                step = -1;
            } else {
                // method(arr[i][0], arr[i][1]);
                int t = Math.abs(step1-step2);
                if(t >=3){
                    step+= t /3;
                    t = t %3;
                }
                if(t >=2){
                    step+= t /2;
                    t = t %2;
                }
                step+= t;
            }
            System.out.println(step);
        }
    }
}
