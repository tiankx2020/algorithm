package com.tkx.java.秋招笔试题.途虎养车;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月31日 19:57
 */
public class T3 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * 返回将数组分成 k 个子集后，各子集 不兼容性 的 和 的 最小值 ，如果无法分成分成 k 个子集，返回 -1
     *
     * @param nums int整型一维数组
     * @param k    int整型
     * @return int整型
     */
    // public int minimumIncompatibility (int[] nums, int k) {
    //     // write code here
    //     Map<Integer,Integer> map = new HashMap<>();
    //     for(int i=0;i< nums.length;i++){
    //         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    //     }
    //     int t = nums.length/k;
    //     for(int x:map.values()){
    //         if(x>t) return -1;
    //     }
    //     Set<Integer> set = new HashSet<>();
    //     for(int x:nums){
    //         set.add(x);
    //     }
    //     List<Integer> list = new ArrayList<>(set);
    //     Collections.sort(list);
    //     int res = Integer.MAX_VALUE;
    //     for(int i=1;i<list.size();i++){
    //         res = Math.min(res,list.get(i)-list.get(i-1));
    //     }
    //     return res;
    // }
    public int minimumIncompatibility(int[] nums, int k) {
        int n = nums.length, per = nums.length / k;
        Arrays.sort(nums);
        Arrays.stream(nums).sorted();
        if (k == 1) {
            for (int i = 1; i < n; i++)
                if (nums[i] == nums[i - 1]) return -1;
            return nums[n - 1] - nums[0];
        }
        if (k == n)
            return 0;

        int MAX = (nums[n - 1] - nums[0]) * k;
        int status = 1;
        for(int i=0;i<n;i++){
            status*=2;
        }
        int[][] dp = new int[status][n];
        int[] cs = new int[status];
        for (int i = 0; i < status; i++) {
            int tmp = 0;
            for (int j = 0; j < n; j++) {
                dp[i][j] = MAX;
                if ((i & (1 << j)) != 0) {
                    tmp++;
                }
            }
            cs[i] = tmp;
        }
        Arrays.fill(dp[0], 0);
        for (int mk = 1; mk < status; mk++) {
            if (cs[mk] % per == 0) {
                for (int firstIndex = 0; firstIndex < n; firstIndex++) {
                    if ((mk & (1 << firstIndex)) != 0) {
                        dp[mk][0] = Math.min(dp[mk][0], dp[mk ^ (1 << firstIndex)][firstIndex]);
                    }
                }
                for (int pre = 1; pre < n; pre++) {
                    dp[mk][pre] = dp[mk][0];
                }
            } else {
                for (int pre = 0; pre < n - 1; pre++) {
                    for (int p = pre + 1; p < n; p++) {
                        if ((mk & (1 << p)) != 0 && nums[p] != nums[pre]) {
                            dp[mk][pre] = Math.min(dp[mk][pre], dp[mk ^ (1 << p)][p] + nums[p] - nums[pre]);
                        }
                    }
                }
            }
        }
        if (dp[status - 1][0] >= MAX) {
            return -1;
        }
        return dp[status - 1][0];
    }
}
