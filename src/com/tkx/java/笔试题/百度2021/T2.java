package com.tkx.java.笔试题.百度2021;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月16日 21:21
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        Queue<Integer>[] qs = new Queue[n + 1];
        for (int i = 1; i <= n; i++) {
            qs[i] = new LinkedList<Integer>();
            qs[i].add(i);
        }
        for (int i = 1; i <= n; i++) {
            map.put(i, i);
        }
        for (int i = 0; i < m; i++) {
            char c = sc.next().charAt(0);
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (c == 'C') {
                while (!qs[x].isEmpty()) {
                    int tmp = qs[x].poll();
                    map.put(tmp, y);
                    qs[y].add(tmp);
                }
            } else {
                int xIdx = map.get(x);
                int yIdx = map.get(y);

                if (xIdx != yIdx) {
                    System.out.println(-1);
                } else {
                    int index1 = -1;
                    int index2 = -1;
                    Queue<Integer> qt = new LinkedList<>();
                    for (int i1 = qs[xIdx].size()-1; i1 >=0 ; i1--) {
                        int t = qs[xIdx].poll();
                        if (t == x) {
                            index1 = i1;
                        }
                        if (t == y) {
                            index2 = i1;
                        }
                        qt.add(t);
                    }
                    qs[xIdx] = qt;
                    System.out.println(Math.abs(index1 - index2) - 1);
                }
            }
        }
    }
}
