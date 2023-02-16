package com.tkx.java.leecodeHot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 所用方法：双指针+排序
 * 具体思路：下标k一定要取的点，对[k+1,nums.length-1]区间内进行二分查找，三个数的和为sum
 * 如果sum>0  j向左移动，并且nums[j]不能等于原来的那个值
 * 如果sum<0  i向右移动，并且nums[i]不能等于原来的那个值
 * sum==0  添加到List中，并且i,j都更新
 * 时间复杂度：O(N2)
 * 空间复杂度：O(N)
 */
public class _15三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int k = 0; k < nums.length - 2; k++) {
            if (k > 0 && nums[k] == nums[k - 1]) continue;
            int i = k + 1, j = nums.length - 1;
            while (i < j) {
                // 数字偏小 i右动
                if (nums[k] + nums[i] + nums[j] < 0) {
                    i++;
                    while (i < j && nums[i] == nums[i - 1]) i++;
                } else if (nums[k] + nums[i] + nums[j] > 0) {
                    j--;
                    while (i < j && nums[j] == nums[j + 1]) j--;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    res.add(list);
                    // i , j 移动
                    i++;
                    while (i < j && nums[i] == nums[i - 1]) i++;
                    j--;
                    while (i < j && nums[j] == nums[j + 1]) j--;
                }
            }
        }

        return res;
    }
}
