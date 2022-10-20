package com.tkx.java.秋招笔试题.微众;

import java.util.Arrays;
import java.util.Scanner;


public class T2Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            if(first % second == 0 || second % first == 0){
                int max = Math.max(first,second);
                int min = Math.min(first,second);
                int mid = max / min;
                if(mid % 2 == 0 || mid % 4 == 0 || mid % 8 == 0){
                    int cur = 0;
                    while (max != min){
                        if(max % 8 == 0 && max / 8 >= min){
                            if(max / 8 == min){
                                cur++;
                                continue;
                            } else {
                                max /= 8;
                                cur++;
                            }
                        } else if(max % 4 == 0 && max / 4 >= min){
                            if(max / 4 == min){
                                cur++;
                                continue;
                            } else {
                                max /= 4;
                                cur++;
                            }
                        } else if(max % 2 == 0 && max / 2 >= min){
                            if(max / 2 == min){
                                cur++;
                                continue;
                            } else {
                                max /= 2;
                                cur++;
                            }
                        } else {
                            res[i] = -1;
                            continue;
                        }
                    }
                    res[i] = cur;
                } else {
                    res[i] = -1;
                }
            } else {
                res[i] = -1;
            }
        }
        Arrays.stream(res).forEach(e -> {
            System.out.println(e);
        });
    }
}
