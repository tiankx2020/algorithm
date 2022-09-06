package com.tkx.java.help;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月03日 10:41
 */
public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        char[] cs = sc.nextLine().toCharArray();
        Set<Character>[] set = new Set[n + 1];
        for (int i = 0; i < set.length; i++) {
            set[i] = new HashSet<>();
        }
        /**
         * 核心代码
         * 从后往前遍历
         * 父节点 添加 子节点的字符集set
         */
        for (int i = n; i >= 1; i--) {
            int tmp = i;
            while (tmp != 0) {
                // 加上当前节点
                set[tmp].add(cs[tmp - 1]);
                // 父节点加上子节点的字符集
                set[arr[tmp]].addAll(set[tmp]);
                // 切换到父节点
                tmp = arr[tmp];
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(set[i].size() + " ");
        }
    }

}
