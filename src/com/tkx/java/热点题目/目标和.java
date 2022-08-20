package com.tkx.java.热点题目;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月11日 15:04
 */
public class 目标和 {
    //可以使用0-1背包问题解决
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int neq = (sum - target) / 2;
        //dp[i][j]表示从前i中选取的和为j的 方案数
        int[][] dp = new int[nums.length + 1][neq + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                dp[i][j]+= dp[i-1][j];
                if(j-nums[i-1]>=0){
                    dp[i][j]+=dp[i-1][j-nums[i-1]];
                }
            }
        }
        return dp[dp.length-1][neq];
    }
}
