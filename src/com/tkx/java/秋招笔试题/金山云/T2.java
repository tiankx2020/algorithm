package com.tkx.java.秋招笔试题.金山云;


import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月08日 20:49
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char f = sc.next().toCharArray()[0];
        int min = 0, max = 0;
        // 某个节点必须失败的
        int t = sc.nextInt();
        int time = sc.nextInt();
        time -= 3;
        if (f == 'a') {
            time -= t;
            // 表示第一个节点失败了t次
            min = t + time / 3;
            if(time%3!=0) min++;
            max = t + time / 2;
        }
        if (f == 'b') {
            time -= 2 * t;
            min = t + time / 3 + time % 3;
            max = t + time;
        }
        if (f == 'c') {
            time -= 3 * t;
            min = t + time / 2 + time % 2;
            max = t + time;
        }
        System.out.println(max + " " + min);
    }
}
