package com.tkx.java.秋招笔试题.顺丰;


import java.util.*;

public class T2 {
    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n + 1];
        int[] num = new int[n + 1];
        int[] count = new int[n + 1];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 2; i <= n; i++) {
            p[i] = sc.nextInt();
            List<Integer> list = map.getOrDefault(p[i], new ArrayList<>());
            list.add(i);
            map.put(p[i], list);
        }
        for (int i = 1; i <= n; i++) {
            num[i] = sc.nextInt();
        }
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(1);
        List<Integer> order = new ArrayList<>();
        while (deque.size() > 0) {
            int parent = deque.pollFirst();
            count[parent] += Math.abs(num[parent]);
            order.add(parent);
            res = Math.max(count[parent], res);
            List<Integer> list = map.getOrDefault(parent,new ArrayList<>());
            for (int i = 0; i < list.size(); i++) {
                int child = list.get(i);
                num[child] -= num[parent];
                count[child] += num[parent];
                deque.add(child);
            }
        }
        System.out.println(res);
    }

}
