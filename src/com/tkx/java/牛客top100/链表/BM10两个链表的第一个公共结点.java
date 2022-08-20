package com.tkx.java.牛客top100.链表;

import com.tkx.java.ListNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月17日 21:29
 */
public class BM10两个链表的第一个公共结点 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode p1 = pHead1,p2 = pHead2;
        while (p1!=p2){
            p1 = p1!=null?p1.next:pHead2;
            p2 = p2!=null?p2.next:pHead1;
        }
        return  p1;
    }
}
