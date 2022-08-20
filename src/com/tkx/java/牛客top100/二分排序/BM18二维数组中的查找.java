package com.tkx.java.牛客top100.二分排序;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月18日 21:30
 */
public class BM18二维数组中的查找 {
    public boolean Find(int target, int[][] array) {
        int m = array.length;
        if (m == 0) return false;
        int n = array[0].length;
        if (n == 0) return false;
        int i = m-1,j=0;
        while (i>=0 && j<n){
            if(array[i][j]<target){
                j++;
            }else if(array[i][j]>target){
                i--;
            }else{
                return true;
            }
        }
        return  false;
    }
}
