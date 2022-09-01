package com.tkx.java.秋招笔试题.深信服;

import com.tkx.java.ListNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月01日 19:37
 */
public class T3 {
    public ListNode reverseBetween(ListNode head) {
        // write code here
        int index = 0;
        ListNode p = head;
        ListNode p2 = null;
        ListNode p3 = null;
        ListNode p6 = null;
        ListNode p7 = null;
        while (true) {
            index++;
            if (index == 2) {
                p2 = p;
            }
            if (index == 3) {
                p3 = p;
            }
            if (index == 6) {
                p6 = p;
            }
            if (index == 7) {
                p7 = p;
            }
            if (index == 8) {
                break;
            }
            p = p.next;
        }
        reverse(p3,p7);
        p2.next = p6;
        p3.next = p7;
        return head;
    }

    public void reverse(ListNode node, ListNode end) {
        ListNode pre = null;
        ListNode cur = node;
        ListNode tmp = null;
        while (cur != end){
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
    }
}
