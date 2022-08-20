package com.tkx.java.剑指offer;

import java.util.Stack;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月11日 18:15
 */
public class MinStack {
    /** initialize your data structure here. */
    Stack<Integer> st1;
    Stack<Integer> st2;
    public MinStack() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
        st1.push(x);
        if(st2.empty() || st2.peek()>=x){
            st2.add(x);
        }
    }

    public void pop() {
        int x = st1.pop();
        if( !st2.empty()&&st2.peek()==x){
            st2.pop();
        }
    }

    public int top() {
        return st1.peek();
    }

    public int min() {
        return st2.peek();
    }
}
