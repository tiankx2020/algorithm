package com.tkx.java.滑动窗口;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月03日 20:22
 */
public class 长度最小的子数组 {
    public int minSubArrayLen(int target, int[] nums) {
        //滑动窗口
        Queue<Integer> queue = new LinkedList<>();
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(sum<target){
                sum+=nums[i];
                queue.add(nums[i]);
            }else{
                while(sum>=target){
                    ans = Math.min(ans,queue.size());
                    sum-=queue.poll();
                }
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}
