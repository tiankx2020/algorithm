package com.tkx.java.牛客top100.堆_栈_队列;

import java.util.Stack;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月19日 19:03
 */
public class BM43包含min函数的栈 {
    Stack<Integer> stack1 = new Stack<>();
    //维持一个单调递减栈
    Stack<Integer> stack2 = new Stack<>();
    //因为栈是先进后出的，所以先进来的元素到的时间一定是比后进来的元素呆的时间长
    //只有当node的值小于stack2的栈顶元素或者stack2是空元素时，node才有可能是最小元素
    public void push(int node) {
        stack1.push(node);
        if(stack2.empty() || stack2.peek()>=node){
            stack2.push(node);
        }
    }

    public void pop() {
        int  x = stack1.pop();
        if(x==stack2.peek()){
            stack2.pop();
        }
    }

    public int top() {
        if(stack1.empty()) return -1;
        return  stack1.peek();
    }

    public int min() {
        if(stack2.empty()) return -1;
        return stack2.peek();
    }
}
