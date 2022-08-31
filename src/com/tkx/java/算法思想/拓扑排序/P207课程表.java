package com.tkx.java.算法思想.拓扑排序;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月01日 10:49
 */
public class P207课程表 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //记录入度为0的节点
        Queue<Integer> queue = new ArrayDeque<>();
        //入度数量
        int[] indegrees = new int[numCourses];
        //出度元素
        List<Integer>[] lists = new List[numCourses];

        for (List list : lists) {
            list = new ArrayList<Integer>();
        }

        int num = 0;
        for (int[] arr : prerequisites) {
            indegrees[arr[0]]++;
            lists[arr[1]].add(arr[0]);
        }

        for (int i = 0; i < indegrees.length; i++) {
            if (indegrees[i] == 0) {
                queue.add(i);
            }
        }
        while (queue.size() > 0) {
            int tmp = queue.poll();
            num++;
            for (int x : lists[tmp]) {
                indegrees[x]--;
                if(indegrees[x]==0){
                    queue.add(x);
                }
            }
        }
        return num==numCourses;
    }

}

