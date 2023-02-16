package com.tkx.java.秋招笔试题.开目信息;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月03日 10:11
 */
public class T3 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        byte[] before = new byte[20];
        for (int i = 0; i < 20; i++) {
            before[i] = (byte) r.nextInt(100);
        }
        // 使用Base64编码器
        BASE64Encoder enc = new BASE64Encoder();
        // 将字节数组转化为字符串
        String str = enc.encodeBuffer(before);
        // 解码器
        BASE64Decoder dec = new BASE64Decoder();
        byte[] after;
        after = dec.decodeBuffer(str);//使用BASE64解码
        // 打印之前的数据
        System.out.println("before= " + Arrays.toString(before));
        // 打印之后的数据
        System.out.println("after = " + Arrays.toString(after));
    }
}
