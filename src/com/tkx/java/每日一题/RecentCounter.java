package com.tkx.java.每日一题;

import sun.misc.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月06日 9:02
 */
public class RecentCounter {

    Deque<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        while (!queue.isEmpty() && t - queue.getFirst() > 3000) {
            queue.removeFirst();
        }
        queue.addLast(t);
        return queue.size();
    }
}
