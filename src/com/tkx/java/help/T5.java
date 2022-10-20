package com.tkx.java.help;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月26日 23:05
 */
public class T5 {
    // public static void main(String[] args) {
    //     int[] arr = {100, 250, 500};
    //     System.out.println(minMemDiff(arr));
    // }
    //
    // public int minMemDiff(int[] memReqs) {
    //     if (memReqs.length == 1) {
    //         return memReqs[0];
    //     }
    //     Arrays.sort(memReqs);
    //     long num1 = 0;
    //     long num2 = 0;
    //     for (int i = memReqs.length - 1; i >= 0; i--) {
    //         if (num1 <= num2) {
    //             num1 += memReqs[i];
    //         } else {
    //             num2 += memReqs[i];
    //         }
    //     }
    //     return (int) Math.abs(num1 - num2);
    // }
}
