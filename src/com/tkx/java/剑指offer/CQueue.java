package com.tkx.java.剑指offer;

import java.util.Stack;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月11日 18:06
 */
public class CQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public CQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();

    }

    public void appendTail(int value) {
        st1.add(value);
    }

    public int deleteHead() {
        if(st1.empty() && st2.empty()) return -1;
        if(!st2.empty()) return st2.pop();
        while (!st1.empty()){
            st2.add(st1.pop());
        }
        return st2.pop();
    }
}
