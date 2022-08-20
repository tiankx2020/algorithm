package com.tkx.java.热点题目;

import java.util.Stack;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月13日 13:51
 */
public class 每日温度 {
    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
    }

    //题目
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                int tmp = stack.pop();
                ans[tmp] = i - tmp;
            }
            stack.add(i);
        }
        return ans;
    }

}
