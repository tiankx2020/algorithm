package com.tkx.java.leecode周赛.D287地平线;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月03日 10:37
 */
public class T2 {
    public List<List<Integer>> findWinners(int[][] matches) {
        int len = matches.length;
        int[] inDegree = new int[100005];
        Set<Integer> set = new HashSet<>();
        for (int[] match : matches) {
            inDegree[match[1]]++;
            set.add(match[0]);
            set.add(match[1]);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=1;i<100005;i++){
            if(inDegree[i]==0 && set.contains(i)){
                list1.add(i);
            }
            if(inDegree[i]==1 && set.contains(i)){
                list2.add(i);
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        return list;
    }
}
