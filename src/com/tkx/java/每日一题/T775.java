package com.tkx.java.每日一题;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月16日 9:59
 */
public class T775 {
    // 全局倒置数
    int n1 = 0;

    public boolean isIdealPermutation(int[] nums) {
        // 局部倒置数
        int n2 = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                n2++;
            }
        }
        mergeSort(nums,0,nums.length-1);
        return n1 == n2;
    }

    //利用归并排序
    public void mergeSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int l1 = left, l2 = mid + 1;
        int index = 0;
        while (l1 <= mid && l2 <= right) {
            if (nums[l1] <= nums[l2]) {
                temp[index++] = nums[l1++];
            } else {
                temp[index++] = nums[l2++];
                n1+=(mid-l1+1);
            }
        }
        while (l1 <= mid) {
            temp[index++] = nums[l1++];
            n1+=(mid-l1+1);
        }
        while (l2 <= right) temp[index++] = nums[l2++];
        for(int i=0;i<temp.length;i++){
            nums[i+left] = temp[i];
        }

    }
}
