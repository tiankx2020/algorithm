package com.tkx.java.leecode周赛.D315;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月16日 17:10
 */
public class T4 {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0;
        List<Integer> minList = new ArrayList<>();
        List<Integer> maxList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == minK) minList.add(i);
            if (nums[i] == maxK) maxList.add(i);
        }
        for (int i = 0; i < minList.size(); i++) {
            for (int j = 0; j < maxList.size(); j++) {
                int start = Math.min(minList.get(i), maxList.get(j));
                int end = Math.max(minList.get(i), maxList.get(j));
                boolean flag = true;
                for (int k = start; k <= end; k++) {
                    if (nums[k] > maxK || nums[k] < minK) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    int left = 1;
                    int right = 1;
                    while (start-1>=0 && nums[start-1]>minK && nums[start-1]<maxK) {
                        left++;
                        start--;
                    }
                    while (end+1<nums.length && nums[end+1]>minK && nums[end+1]<maxK) {
                        end++;
                        right++;
                    }
                    res+=left*right;
                }
            }
        }
        return res;
    }
}
