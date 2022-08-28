package com.tkx.java.秋招笔试题.字节跳动;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月28日 11:21
 */
public class T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int res = Integer.MIN_VALUE;
        int[] minArr= minWin(arr,k+1);
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        List<Integer> add = new ArrayList<>();
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            add.add(sum);
            sum-=arr[i-k];
        }
        for(int i=0;i<minArr.length;i++){
            res =Math.max(res,add.get(i)-minArr[i]);
        }
        System.out.println(res);
    }


    public  static int[] minWin(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return new int[0];
        Deque<Integer> queue = new ArrayDeque<>();
        int[] ans = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            while (!queue.isEmpty() && nums[i] < queue.getLast()) {
                queue.removeLast();
            }
            queue.addLast(nums[i]);
        }
        ans[0] = queue.getFirst();
        for (int i = k; i < nums.length; i++) {
            //先移除
            if (nums[i - k] == queue.getFirst()) queue.removeFirst();
            while (!queue.isEmpty() && nums[i] < queue.getLast()) {
                queue.removeLast();
            }
            queue.add(nums[i]);
            ans[i - k + 1] = queue.getFirst();
        }
        return ans;
    }
}

