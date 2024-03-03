package com.tkx.java.每日一题;

import java.util.ArrayList;
import java.util.List;

class T225 {


    List<Integer> q1;
    List<Integer> q2;

    public T225() {
        q1 = new ArrayList<>();
        q2 = new ArrayList<>();
    }

    // 进栈的时候往q1里面添加输入
    public void push(int x) {
        while (!q1.isEmpty()) {
            q2.add(q1.remove(q1.size() - 1));
        }
        q1.add(x);
        while (!q2.isEmpty()) {
            q1.add(q2.remove(q2.size() - 1));
        }
    }

    // 出栈的时候，将q2里面的数据全部加入到q1，然后加入到q2
    // 最后剔除到
    public int pop() {
        return  q1.remove(0);
    }

    public int top() {
        return q1.get(0);
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */