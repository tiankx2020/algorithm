package com.tkx.java.牛客top100.堆_栈_队列;

import java.util.ArrayList;
import java.util.logging.Level;

/**
    算法思想：利用快排中的双指针思想，一次遍历可以找到一个元素的位置，判断这个元素的位置是在k的左边或者右边
    如果返回的index>k 将r = index-1, index<k l=index+1
    否则结束循环，找到了答案
 */
public class BM46最小的K个数 {
    public static void main(String[] args) {
        int[] arr = {4,5,1,6,2,7,3,8};
        int k = 1;
        GetLeastNumbers_Solution(arr,k);
    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        int index = -1;
        int l = 0,r =input.length-1;
        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            index = quickSort(input,l,r);
            if(index+1==k) break;
            if(index+1>k){
                r=index-1;
            }else{
                l=index+1;
            }
        }
        for(int i=0;i<k;i++){
            list.add(input[i]);
        }
        return  list;
    }

    public static int quickSort(int[] arr,int left,int right){
        if(left>right) return -1;
        int tmp = arr[left];
        int l =left,r =right;
        while (l<r){
            while (l<r && arr[r]>=tmp) r--;
            while (l<r && arr[l]<=tmp) l++;
            int t= arr[r];
            arr[r] = arr[l];
            arr[l] = t;
        }
        arr[left] = arr[l];
        arr[l] = tmp;
        return  l;
    }
}
