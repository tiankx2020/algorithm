package com.tkx.java.leecodeHot100;

import com.tkx.java.ListNode;

/**
 * 所用方法：归并，分治
 * 思路：先将lists进行二分分割，如果left==right 直接返回lists[left]; 否则进行切割
 * merge()方法的作用，将[left,right]的链表合并成一个有序链表，并返回
 */
public class _23合并K个链表 {
    // public ListNode mergeKLists(ListNode[] lists) {
    //     if (lists == null || lists.length == 0) return null;
    //     return merge(lists, 0, lists.length - 1);
    // }
    //
    // public ListNode merge(ListNode[] lists, int left, int right) {
    //     if (left == right) return lists[left];
    //     int mid = (left + right) / 2;
    //     ListNode l = merge(lists, left, mid);
    //     ListNode r = merge(lists, mid + 1, right);
    //     return mergeListNode(l, r);
    // }
    //
    // //合并两个有序链表
    // public ListNode mergeListNode(ListNode list1, ListNode list2) {
    //     if (list1 == null) return list2;
    //     if (list2 == null) return list1;
    //     if (list1.val <= list2.val) {
    //         list1.next = mergeListNode(list1.next, list2);
    //         return list1;
    //     } else {
    //         list2.next = mergeListNode(list1, list2.next);
    //         return list2;
    //     }
    // }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0 ) return null;
        ListNode listNode = mergeListNode(lists, 0, lists.length - 1);
        return listNode;
    }
    public ListNode mergeListNode(ListNode[] lists,int l,int r) {
        if(l==r) return lists[l];
        int mid = (l+r)/2;
        ListNode lListNode = mergeListNode(lists, l, mid);
        ListNode rListNode = mergeListNode(lists, mid+1, r);
        ListNode listNode = merge(lListNode, rListNode);
        return listNode;
    }

    public ListNode merge(ListNode p, ListNode q) {
        if (p == null) return q;
        if (q == null) return p;
        if (p.val < q.val) {
            p.next = merge(p.next, q);
            return p;
        } else {
            q.next = merge(p, q.next);
            return q;
        }
    }
}
