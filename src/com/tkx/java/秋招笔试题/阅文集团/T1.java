package com.tkx.java.秋招笔试题.阅文集团;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月01日 19:48
 */
public class T1 {
    // 合并区间
    public int[][] merge(int[][] arr) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < arr.length; i++) {
            if (list.isEmpty()) {
                list.add(arr[i]);
            } else {
                int[] a = list.get(list.size() - 1);
                int[] b = arr[i];
                if (a[1] >= b[0]) {
                    list.remove(list.size() - 1);
                    int[] c = new int[]{Math.min(a[0], b[0]), Math.max(a[1], b[1])};
                    list.add(c);
                }
            }
        }
        int[][] res = new int[list.size()][2];
        System.out.println(list.size());
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
