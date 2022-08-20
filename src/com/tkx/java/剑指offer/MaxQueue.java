package com.tkx.java.剑指offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description: 队列的最大值
 * @author: scott
 * @date: 2022年05月11日 20:00
 */
public class MaxQueue {
    Deque<Integer> q1;
    Deque<Integer> q2;

    public MaxQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public int max_value() {
        if (q2.isEmpty()) {
            return -1;
        } else {
            return q2.getFirst();
        }
    }

    public void push_back(int value) {
        q1.add(value);
        while (q2.isEmpty() && value > q2.getLast()) {
            q2.removeLast();
        }
        q2.add(value);
    }

    public int pop_front() {
        if (q1.isEmpty()) return -1;
        int x = q1.removeFirst();
        if (!q2.isEmpty() && x == q2.getFirst()) {
            q2.removeFirst();
        }
        return x;
    }
}
