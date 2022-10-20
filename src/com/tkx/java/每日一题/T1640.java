package com.tkx.java.每日一题;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月22日 10:31
 */
public class T1640 {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        for (int i = 0; i < arr.length; ) {
            for (int j = 0; j < pieces.length&& i < arr.length; j++) {
                if (arr[i] == pieces[j][0]) {
                    for (int k = 0; k < pieces[j].length && i < arr.length; k++, i++) {
                        if (pieces[j][k] != arr[i]) {
                        }
                    }
                }
            }
            if(i==arr.length) return true;
        }
        return true;
    }
}
