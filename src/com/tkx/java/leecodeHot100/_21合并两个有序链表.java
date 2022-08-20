package com.tkx.java.leecodeHot100;

import com.tkx.java.ListNode;

/**
 * 所用方法：递归
 * 核心思想：判断list1,list2的值，list1.val<=list2.val的话，list1.next = mergeTwoLists(list1.next, list2.next)
 * 反之同理
 * 时间复杂度：O(M+N)
 * 空间复杂度：。。
 */
public class _21合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        if(list1.val<=list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return  list1;
        }else{
            list2.next = mergeTwoLists(list1,list2.next);
            return  list2;
        }
    }
}
