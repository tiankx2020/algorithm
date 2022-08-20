package com.tkx.java.面试题.metaApp;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月05日 16:47
 */
public class T2 {
    public static void main(String[] args) {
        int[] arr = {461,278,133,506,843,895,222,141,716,836};
        answer(arr);
    }
    public static int[] answer(int[] x) {
        int t1=0;
        if(x.length>=16) t1 = x[15];
        else if(x.length>=8) t1 = x[16/2-1];
        else if(x.length>=4) t1 = x[16/4-1];
        else if(x.length>=2) t1= x[16/8-1];
        else if(x.length==1) t1 = x[0];
        int[] arr = new int[3];
        for(int i=0;i<3;i++){
            arr[i] = 43+t1*(8-i);
        }
        int tmp = arr[0];
        arr[0] = arr[2];
        arr[2] = tmp;
        return arr;
    }
}
