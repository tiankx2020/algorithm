package com.tkx.java;

import java.io.Serializable;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月13日 17:20
 */
public class ListNode implements Serializable {
     public int val;
     public ListNode next;
     public ListNode() {}
     public ListNode(int val) { this.val = val; }
     public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
