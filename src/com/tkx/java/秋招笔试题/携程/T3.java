package com.tkx.java.秋招笔试题.携程;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月30日 19:19
 */
public class T3 {
    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        char[] cs = sc.nextLine().toCharArray();
        int r = 0;
        int g = 0;
        int b = 0;
        for (char c : cs) {
            if (c == 'r') r++;
            if (c == 'g') g++;
            if (c == 'b') b++;
        }
        Set<Integer> set = new HashSet<>();
        Map<Integer, List<Integer>> threeMap = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int x = sc.nextInt();
            int parent = Math.min(a, x);
            int child = Math.max(a, x);
            List<Integer> list = threeMap.getOrDefault(parent, new ArrayList<>());
            list.add(child);
            threeMap.put(parent, list);
            set.add(child);
        }
        for (int x : set) {
            int[] nums = {r, g, b};
            int[] sub = {0, 0, 0};
            dfs(x, threeMap, cs, sub);
                if (sub[0] > 0 && sub[1] > 0 && sub[2] > 0 && nums[0] - sub[0] > 0 && nums[1] - sub[1] > 0 && nums[2] - sub[2] > 0) {
                    res++;
                }
        }
        System.out.println(res);
    }
    public static void dfs(int index, Map<Integer, List<Integer>> map, char[] cs, int[] sub) {
        List<Integer> list = map.getOrDefault(index, new ArrayList<>());
        char color = cs[index - 1];
        if (color == 'r') sub[0]++;
        if (color == 'g') sub[1]++;
        if (color == 'b') sub[2]++;
        for (int i = 0; i < list.size(); i++) {
            int child = list.get(i);
            dfs(child, map, cs, sub);
        }
    }

}
