package com.tkx.java.每日一题;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月25日 8:45
 */
public class 随机数索引 {
    Random r;
    Map<Integer, List<Integer>> map;
    public 随机数索引(int[] nums) {
        map = new HashMap<>();
        r = new Random();
        for(int i=0;i<nums.length;i++){
            List<Integer> list = map.getOrDefault(nums[i], new LinkedList<>());
            list.add(i);
            map.put(nums[i],list);
        }

    }

    public int pick(int target) {
        int x = r.nextInt(map.get(target).size());
        return  map.get(target).get(x);
    }
}
