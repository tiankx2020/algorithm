package com.tkx.java.每日一题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月08日 10:44
 */
public class T870 {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Arrays.fill(res,-1);
        boolean[] v = new boolean[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            int minIndex = -1;
            for(int j=0;j<nums1.length;j++){
                if(v[j]==false && nums1[j]>nums2[i]){
                    if(minIndex == -1){
                        minIndex = j;
                    }else if(nums1[j]<=nums1[minIndex]){
                        minIndex = j;
                    }
                }
            }
            if(minIndex!=-1) {
                res[i] = nums1[minIndex];
                v[minIndex] = true;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < v.length; i++) {
            if(v[i] == false){
                list.add(i);
            }
        }
        int index = 0;
        for (int i = 0; i < res.length; i++) {
            if(res[i]==-1){
                res[i] = nums1[list.get(index++)];
            }
        }
        return res;
    }
}
