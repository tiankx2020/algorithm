package com.tkx.java.dongboy.prefet;

import java.util.PriorityQueue;

/**
 * @author dong boy
 * @date 2022年08月27日 14:40
 */
public class One {
    public static void main(String[] args) {
        System.out.println(one(new int[]{2, 1, 9, 8, 4, 2, 5}));
        System.out.println(one(new int[]{30, 45, 12, 23, 8}));
    }

    // 方法体
    public static int one(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        for (int data : nums) {
            queue.offer(data);
        }
        while (queue.size() > 1) {
            int temp = queue.poll() - queue.poll();
            queue.offer(temp);
        }
        return queue.poll();
    }
}
