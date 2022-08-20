package com.tkx.java.排序Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月13日 17:44
 */
public class T2 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(3)-1;
        }
        method(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void method(int[] arr){
        int i=-1,j=arr.length;
        for(int k=0;k<arr.length;){
            if(arr[k]==-1){
                swap(arr,++i,k);
            }
            if(arr[k]==1){
                swap(arr,--j,k);
            }
            if(arr[k] == 0){
                k++;
            }
        }
    }

    public static void swap(int[] arr, int i ,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j]  = tmp;
    }
}
