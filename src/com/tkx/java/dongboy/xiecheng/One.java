package com.tkx.java.dongboy.xiecheng;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author dong boy
 * @date 2022年08月30日 19:23
 */
public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int[] nums = new int[q];
        for (int i = 0; i < q; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < q; i++) {
            if (nums[i] % 2 == 0) {
                continue;
            } else { // 奇数
                String cur = String.valueOf(nums[i]);
                int index = first(cur);
                // 找到第一个偶数的位置
                if (index == -1) {
                    nums[i] = -1;
                } else {
                    char[] ch = cur.toCharArray();
                    char temp = ch[index];
                    ch[index] = ch[ch.length - 1];
                    ch[ch.length - 1] = temp;
                    nums[i] = Integer.parseInt(new String(ch));
                }
            }
        }
        Arrays.stream(nums).forEach(e -> {
            System.out.println(e);
        });
    }

    public static int first(String cur) {
        if (cur.contains("2")) {
            return cur.indexOf("2");
        }
        if (cur.contains("4")) {
            return cur.indexOf("4");
        }
        if (cur.contains("6")) {
            return cur.indexOf("6");
        }
        if (cur.contains("8")) {
            return cur.indexOf("8");
        }
        if (cur.contains("0")) {
            return cur.indexOf("0");
        }
        return -1;
    }
}
