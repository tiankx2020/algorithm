package com.tkx.java.面试题.即构;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月20日 11:07
 */
public class T2 {

    public static void main(String[] args) {

    }

    public void mergeArr(int[] arr1,int arr2[],int m,int n){
        int index = m+n-1;
        int i=m-1,j=n-1;
        while (i>=0 && j>=0){
            if(arr1[i]>=arr2[j]){
                arr1[index--] = arr1[i--];
            }else{
                arr1[index--] = arr2[j--];
            }
        }
        while (i>=0){
            arr1[index--] = arr1[i--];
        }
        while (j>=0){
            arr1[index--] = arr2[j--];
        }
    }
}
