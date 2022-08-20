package com.tkx.java.代码随想录.数组.双指针;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月17日 11:39
 */
public class Leecode904 {
    public int totalFruit(int[] tree) {
        int ans = 0, i = 0;
        Counter count = new Counter();
        for (int j = 0; j < tree.length; ++j) {
            count.add(tree[j], 1);
            while (count.size() >= 3) {
                count.add(tree[i], -1);
                if (count.get(tree[i]) == 0)
                    count.remove(tree[i]);
                i++;
            }

            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}
class Counter extends HashMap<Integer, Integer> {
    public int get(int k) {
        return containsKey(k) ? super.get(k) : 0;
    }

    public void add(int k, int v) {
        put(k, get(k) + v);
    }
}

