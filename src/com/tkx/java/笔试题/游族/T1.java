package com.tkx.java.笔试题.游族;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月13日 20:09
 */
public class T1 {
    public ArrayList<ArrayList<Integer>> threeSum (int[] nums) {
        // write code here
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>=1 && nums[i] == nums[i-1]) continue;
            for(int j=i+1,k=nums.length-1;j<k;){
                int t1 = nums[j];
                int t2 = nums[k];
                if(nums[i]+nums[j]+nums[k]<0){
                    while (j<k && nums[j]==t1) j++;
                }else if(nums[i]+nums[j]+nums[k]>0){
                    while (j<k && nums[k]==t2) k--;
                }else{
                    ArrayList<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(nums[k]);
                    res.add(tmp);
                    while (j<k && nums[j]==t1) j++;
                    while (j<k && nums[k]==t2) k--;
                }
            }
        }
        return res;
    }
}
