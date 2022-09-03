package com.tkx.java.dongboy.nine03;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author dong boy
 * @date 2022年09月03日 16:54
 */
public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int m = scanner.nextInt();
        String[] split = str.split(",");
        int n = split.length;
        if (n < m) {
            System.out.println(-1);
            return;
        }
        int[] task = new int[n];
        for (int i = 0; i < n; i++) {
            task[i] = Integer.parseInt(split[i]);
        }
        int res = 0; // 结果
        int index = 0; // 下标
        List<Integer> list = new ArrayList<>();
        while (m > 1 && index < n) {
            // 找到一直递减的一个
            int cur = task[index]; // 当前
            list.add(index);
            res += cur;
            m--;
            while (index + 1 < n && cur >= task[index + 1]) { // 一直找到大于当前的数字
                index++;
            }
            index++;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            if(!list.contains(i)){
                queue.offer(task[i]);
            }
        }
        if (m > 0) {
            for (int i = 1; i <= m; i++) {
                res += queue.poll();
            }
        }
        System.out.println(res);
    }
}
