package com.tkx.java.每日一题;

import java.util.Stack;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月31日 9:37
 */
public class 验证栈序列 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0,j=0;i<pushed.length;i++){
            stack.push(pushed[i]);
            while (stack.size()>0 && stack.peek()==popped[j]){
                j++;
                stack.pop();
            }
        }
        return stack.empty();
    }
}
