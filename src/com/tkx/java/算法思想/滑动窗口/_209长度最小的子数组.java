package com.tkx.java.算法思想.滑动窗口;


/**
 * 滑动窗口的思想
 * left 表示起始值
 * 【left,i】表示这一段区间
 */
public class _209长度最小的子数组 {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            while (sum>=target){
                // 满足题目要求
                if(sum<res){
                    res = Math.min(res,i-left+1);
                }
                // left向前移动，寻找最优值
                sum-=nums[left++];
            }

        }
        if(res == Integer.MAX_VALUE) return 0;
        return res;
    }
}
