package com.tkx.java.笔试题.金山云;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月14日 20:46
 */
public class T2 {
    // public static void main(String[] args) {
    //     int  d, n;
    //     double x;
    //     Scanner sc = new Scanner(System.in);
    //     x =sc.nextDouble();
    //     d =sc.nextInt();
    //     n =sc.nextInt();
    //     String s = "" + 1/x;
    //     String[] sarr = s.split("\\.");
    //     System.out.println(sarr[1].substring(d-1,d-1+n));
    // }

    private static final DecimalFormat df = new DecimalFormat("0.00000000000000000000000000000000");
    //在main函数中调用方法
    public static void main(String[] args) {
        int  d, n;
        double x;
        Scanner sc = new Scanner(System.in);
        x =sc.nextDouble();
        d =sc.nextInt();
        n =sc.nextInt();
        // String s = "" + 1/x;
        // String[] sarr = s.split("\\.");
        // System.out.println(sarr[1].substring(d-1,d-1+n));
        System.out.println(div(1.0, x));
    }
    /** 小数精确除法   */
    public static double div(double d1,double d2)
    {
        BigDecimal bd1 = BigDecimal.valueOf(d1);
        BigDecimal bd2 = BigDecimal.valueOf(d2);
        /*
         * 当除不尽时，以四舍五入的方式（关于除不尽后的值的处理方式有很多种）保留小数点后10位小数
         */
        return bd1.divide(bd2, 10000, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

}
