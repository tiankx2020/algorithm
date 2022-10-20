package com.tkx.java.leecode周赛.D315;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月16日 16:58
 */
public class T2 {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            StringBuilder sb = new StringBuilder();
            sb.append(num);
            sb = sb.reverse();
            set.add(Integer.valueOf(sb.toString()));
        }
        return set.size();
    }
}
