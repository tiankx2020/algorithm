package com.tkx.java.牛客top100.堆_栈_队列;

import java.util.Stack;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月19日 18:57
 */
public class BM42用两个栈实现队列 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(!stack2.empty()){
            return stack2.pop();
        }
        while (!stack1.empty()){
            stack2.push(stack1.pop());
        }
        return stack2.isEmpty() ? -1 : stack2.pop();
    }
}
