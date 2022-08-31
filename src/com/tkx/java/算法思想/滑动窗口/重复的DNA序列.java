package com.tkx.java.算法思想.滑动窗口;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月03日 20:55
 */
public class 重复的DNA序列 {
    public static void main(String[] args) {
        findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
    }

    public static List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int j = 10; j <= s.length(); j++) {
            String sub = s.substring(j - 10, j);
            int sum = map.getOrDefault(sub, 0);
            if (sum == 1) {
                list.add(sub);
            }
            map.put(sub, sum + 1);
        }
        return list;
    }
}
