package com.tkx.java.热点题目;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月19日 15:42
 */
public class 合并区间 {

    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < intervals.length; i++) {
            if (list.isEmpty()) {
                list.add(intervals[i]);
            } else {
                int[] a = list.get(list.size() - 1);
                int[] b = intervals[i];
                if (a[1] >= b[0]) {
                    // 去掉前面一个
                    list.remove(list.size()-1);
                    int[] c = {Math.min(a[0], b[0]), Math.max(a[1], b[1])};
                    list.add(c);
                } else {
                    list.add(b);
                }
            }
        }
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < res.length; i++) {
            res[i][0] = list.get(i)[0];
            res[i][1] = list.get(i)[1];
        }
        return  res;
    }
}
