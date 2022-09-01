package com.tkx.java.算法思想.双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月31日 15:08
 */
public class _15三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i-1>=0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1,k=nums.length-1;j<k;){
                int t1 = nums[j];
                int t2 = nums[k];
                if(nums[i]+nums[j]+nums[k]<0){
                    while (j<k && nums[j]==t1) j++;
                }else if(nums[i]+nums[j]+nums[k]>0){
                    while (j<k && nums[k]==t2) k--;
                }else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    res.add(list);
                    while (j<k && nums[j]==t1) j++;
                    while (j<k && nums[k]==t2) k--;
                }
            }
        }
        return res;
    }
}
