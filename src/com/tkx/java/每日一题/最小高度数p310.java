package com.tkx.java.每日一题;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月06日 18:18
 */
public class 最小高度数p310 {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        int[] degree = new int[n];
        List<Integer>[] list = new List[n];
        for (int i = 0; i < list.length; i++) {
            list[i] =new ArrayList<>();
        }
        for (int[] edge : edges) {
            degree[edge[0]]++;
            degree[edge[1]]++;
            list[edge[0]].add(edge[1]);
            list[edge[1]].add(edge[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < degree.length; i++) {
            if (degree[i] == 1) {
                queue.add(i);
            }
        }
        List<Integer> res = null;
        while (queue.size() > 0) {
            res = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                int cur = queue.poll();
                res.add(cur);
                for (int x : list[cur]) {
                    degree[x]--;
                    if(degree[x]==1){
                        queue.add(x);
                    }
                }
            }
        }
        return res;
    }


}
