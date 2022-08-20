package com.tkx.java.leecodeHot100;

import com.tkx.java.ListNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月16日 21:25
 */
public class _24两两交换链表中的节点 {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode one,two,three;
        one = head;
        two = one.next;
        three = two.next;
        two.next = one;
        one.next = swapPairs(three);
        return two;
    }
}
