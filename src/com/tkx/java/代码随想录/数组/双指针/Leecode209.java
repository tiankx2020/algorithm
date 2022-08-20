package com.tkx.java.代码随想录.数组.双指针;

/**
 * @Description: 双指针/滑动窗口
 * @author: scott
 * @date: 2022年08月17日 11:28
 */
public class Leecode209 {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for(int i=0,j=0;j<nums.length;j++){
            sum+=nums[j];
            while (sum>=target){
                ans = Math.min(ans,j-i+1);
                sum-=nums[i--];
            }
        }
        if(ans==Integer.MAX_VALUE) ans=0;
        return ans;
    }
}
