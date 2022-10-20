package com.tkx.java.每日一题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月08日 11:05
 */
public class T870_2 {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Arrays.fill(res,-1);
        // 访问标记符
        boolean[] v = new boolean[nums1.length];
        Arrays.sort(nums1);
        for (int i = 0; i < nums2.length; i++) {
            int result = binarySearch(nums1,nums2[i],v);
            if(result!= nums1.length){
                res[i] = nums1[result];
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < v.length; i++) {
            if(v[i]==false){
                list.add(nums1[i]);
            }
        }
        int index = 0;
        for (int i = 0; i < res.length; i++) {
            if(res[i]==-1){
                res[i] = list.get(index++);
            }
        }
        return res;
    }

    // 找到第一个大于target且没有被访问过的数
    public int binarySearch(int[] nums, int target, boolean[] v) {
        int l = -1, r = nums.length;
        while (l + 1 != r) {
            int mid = (l + r) / 2;
            if (nums[mid] <= target) {
                l = mid;
            } else {
                r = mid;
            }
        }
        while (r < nums.length) {
            if (v[r] == false) {
                v[r] = true;
                return r;
            }
            r++;
        }
        return r;
    }


}
