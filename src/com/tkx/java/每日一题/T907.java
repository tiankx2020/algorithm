package com.tkx.java.每日一题;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class T907 {

    long res = 0;

    public static void main(String[] args) {
        T907 t907 = new T907();
        int res = t907.sumSubarrayMins(new int[]{3, 1, 2, 4});
        System.out.println(res);
    }

    public int sumSubarrayMins(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        for (int len = 2; len <= arr.length; len++) {
            maxSlidingWindow(arr, len);
        }
        return (int) res % 1000000007;
    }

    public void min(int[] arr, int len) {
        // 单调递增队列
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            while (!list.isEmpty() && list.get(list.size() - 1) < arr[i]) {
                list.remove(list.size() - 1);
            }
            list.add(arr[i]);
        }
        res += list.get(0);
        for (int i = len; i < arr.length; i++) {
            while (!list.isEmpty() && list.get(list.size() - 1) < arr[i]) {
                list.remove(list.size() - 1);
            }
            list.add(arr[i]);
            if (list.get(0) == arr[i - len + 1]) list.remove(0);
            res+=list.get(0);
        }
    }

    public void maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[i] < deque.getLast()) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        res += deque.getFirst();
        for (int i = k; i < nums.length; i++) {
            //先移除
            if (nums[i - k] == deque.getFirst()) deque.removeFirst();
            while (!deque.isEmpty() && nums[i] < deque.getLast()) {
                deque.removeLast();
            }
            deque.add(nums[i]);
            res += deque.getFirst();
            res %= 1000000007;
        }
    }
}
