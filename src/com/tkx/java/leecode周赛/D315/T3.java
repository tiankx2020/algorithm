package com.tkx.java.leecode周赛.D315;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月16日 17:02
 */
public class T3 {
    public boolean sumOfNumberAndReverse(int num) {
        for (int i = 0; i <= num; i++) {
            int a = i;
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb = sb.reverse();
            int b = Integer.valueOf(sb.toString());
            if(a+b == num) return true;
        }
        return false;
    }
}
