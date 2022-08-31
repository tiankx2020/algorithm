package com.tkx.java.算法思想.单调队列;

import java.util.ArrayDeque;
import java.util.Deque;


public class _239滑动窗口最大值 {
    /**
     * 因为要在一个区间里面找最值
     * 所以可以使用
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < k - 1; i++) {
            // 单调递减的队列
            while (queue.size() > 0 && queue.getLast() < nums[i]) {
                queue.removeLast();
            }
            queue.addLast(nums[i]);
        }
        int[] res = new int[nums.length-k+1];
        for (int i = k - 1; i < nums.length; i++) {
            while (queue.size() > 0 && queue.getLast()  < nums[i]) {
                queue.removeLast();
            }
            queue.addLast(nums[i]);
            int tmp = queue.getFirst();
            res[i-k+1] = tmp;
            if(nums[i-k+1]==tmp) queue.removeFirst();
        }
        return res;
    }
}
