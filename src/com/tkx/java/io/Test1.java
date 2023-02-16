package com.tkx.java.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年12月05日 8:41
 */
public class Test1 {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("1.txt"));

    }
}
