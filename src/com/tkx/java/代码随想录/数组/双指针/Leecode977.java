package com.tkx.java.代码随想录.数组.双指针;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月17日 11:01
 */
public class Leecode977 {
    // public int[] sortedSquares(int[] nums) {
    //     int[] arr = new int[nums.length];
    //     int absMinIndex = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         if (Math.abs(arr[i]) < Math.abs(arr[absMinIndex])) {
    //             absMinIndex = i;
    //         }
    //     }
    //     int i = absMinIndex, j = absMinIndex + 1;
    //     int index = 0;
    //     System.out.println(absMinIndex);
    //     while (i >= 0 && j < nums.length) {
    //         int numa = arr[i] * arr[i];
    //         int numb = arr[j] * arr[j];
    //         if(numa<numb){
    //             arr[index++] = numa;
    //             i--;
    //         }else{
    //             arr[index++] = numb;
    //             j++;
    //         }
    //     }
    //     while (i>=0) arr[index++] = arr[i]*arr[i--];
    //     while (j<nums.length) arr[index++] = arr[j]*arr[j++];
    //     return  arr;
    // }

    //优化
    public int[] sortedSquares(int[] nums) {
        //因为平方之后最大的数肯定在数组的两端，所以我们可以从两端开始比较
        int[] arr = new int[nums.length];
        int pos = nums.length - 1;
        for (int i = 0, j = nums.length; i <= j; pos--) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                arr[pos] = nums[i] * nums[i];
                i++;
            } else {
                arr[pos] = nums[j] * nums[j];
                j--;
            }
        }
        return arr;
    }
}
