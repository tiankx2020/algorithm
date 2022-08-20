package com.tkx.java.剑指offer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月11日 19:39
 */
public class 滑动窗口的最大值 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return new int[0];
        Deque<Integer> deque = new ArrayDeque<>();
        int[] ans = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[i] > deque.getLast()) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        ans[0] = deque.getFirst();
        for (int i = k; i < nums.length; i++) {
            //先移除
            if(nums[i-k]==deque.getFirst()) deque.removeFirst();
            while (!deque.isEmpty() && nums[i]>deque.getLast()){
                deque.removeLast();
            }
            deque.add(nums[i]);
            ans[i-k+1] = deque.getFirst();
        }

        return ans;
    }
}
