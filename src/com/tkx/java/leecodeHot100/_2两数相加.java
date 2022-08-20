package com.tkx.java.leecodeHot100;

import com.tkx.java.ListNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月13日 17:21
 */
public class _2两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int add = 0;
        ListNode head = new ListNode(-1);
        ListNode tail = head;
        while (l1!=null && l2!=null){
            int val = l1.val+l2.val+add;
            add = val/10;
            tail.next = new ListNode(val%10);
            tail = tail.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1!=null){
            int val = l1.val+add;
            add = val/10;
            tail.next = new ListNode(val%10);
            tail = tail.next;
            l1 = l1.next;
        }
        while (l2!=null){
            int val = l2.val+add;
            add = val/10;
            tail.next = new ListNode(val%10);
            tail = tail.next;
            l2 = l2.next;
        }
        if(add>0) tail.next = new ListNode(add);
        return head.next;
    }
}
