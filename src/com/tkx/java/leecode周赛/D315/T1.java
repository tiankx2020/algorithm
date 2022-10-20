package com.tkx.java.leecode周赛.D315;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月16日 16:54
 */
public class T1 {
    public int findMaxK(int[] nums) {
        int res = -1;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && set.contains(0-nums[i])){
                res = Math.max(nums[i],res);
            }
        }
        return res;
    }
}
