package com.tkx.java.help;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月04日 11:37
 */
public class T4 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 48, 10};
        System.out.println(method(arr));
    }

    public static int method(int[] arr) {
        int res = 0;
        // i是起点，j是重点
        int i, j;
        for (i = 0, j = 1; j < arr.length; ) {
            int k;
            boolean flag = true;
            for (k = j - 1; k >= i; k--) {
                if ((arr[j] & arr[k]) != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                res = Math.max(res, j - i + 1);
                j++;
            } else {
                i = k;
                j = i + 1;
            }

        }
        return res;
    }
}
