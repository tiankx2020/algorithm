package com.tkx.java.面试题.即构;

import java.util.HashMap;
import java.util.Queue;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月18日 17:21
 */
public class T1 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4};
        System.out.println(method(arr));
    }
    public static int method(int[] arr) {
        // for (int i = 0; i < arr.length; i++) {
        //     while (i + 1 != arr[i]) {
        //         if (arr[arr[i] - 1] == arr[i]) return arr[i];
        //         int tmp = arr[arr[i] - 1];
        //         arr[arr[i] - 1] = arr[i];
        //         arr[i] = tmp;
        //     }
        // }
        //
        // return -1;
        int[] tmp = new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            if(tmp[arr[i]]!=0) return arr[i];
            tmp[arr[i]] = arr[i];
        }
        return  -1;
    }
}
