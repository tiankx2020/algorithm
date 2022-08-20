package com.tkx.java.热点题目;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月11日 9:11
 */
public class 全排列 {
    List<List<Integer>> ans;
    List<Integer> tmp;
    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        tmp = new ArrayList<>();
        dfs(nums,0);
        return ans;
    }
    public void  dfs(int[] nums, int index){
        if(index==nums.length){
            ans.add( new ArrayList<>(tmp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=-10 && nums[i]<=10){
                int t = nums[i];
                tmp.add(nums[i]);
                nums[i] = 11;
                dfs(nums,index+1);
                nums[i]= t;
                tmp.remove(tmp.size()-1);
            }
        }
    }
}
