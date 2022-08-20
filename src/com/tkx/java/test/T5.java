package com.tkx.java.test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月02日 20:09
 */
public class T5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        

    }

    public static void method(String s){
        char[] cs = s.toCharArray();
        int numa=0,numb=0,numc=0;
        for (int i = 0; i < cs.length; i++) {
            if(cs[i]=='A'){
                numa++;
            }
            if(cs[i]=='B'){
                numb++;
            }
            if(cs[i]=='C'){
                numc++;
            }
        }
        int ans = 0;
        while(numa!=s.length()/3 || numb!=s.length()/3){

        }
        System.out.println(ans);
    }

}
