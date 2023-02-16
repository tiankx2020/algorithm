package com.tkx.java.秋招笔试题.开目信息;

import com.tkx.java.ListNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月03日 10:03
 */
public class T1 {
    public ListNode reverseList(ListNode head) {
        return recur(head, null);    // 调用递归并返回
    }

    // pre表示上一个节点
    public ListNode recur(ListNode current, ListNode pre) {
        if (current == null) return pre; // 终止条件
        ListNode res = recur(current.next, current);  // 递归后继节点
        current.next = pre;              // 修改节点引用指向
        return res;                  // 返回反转链表的头节点
    }
}
