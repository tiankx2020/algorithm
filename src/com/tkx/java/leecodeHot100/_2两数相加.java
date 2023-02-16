package com.tkx.java.leecodeHot100;

import com.tkx.java.ListNode;


public class _2两数相加 {
    /**
     * 两数相加,利用递归的思想
     * 1. 如果l1 == null && l2==null && add =0 表示计算结束了，直接返回null
     * 否则
     * int num1 = l1 == null ? 0 : l1.val;
     * int num2 = l2 == null ? 0 : l2.val;
     * ListNode node = new ListNode((num1 + num2 + add) % 10);
     * add = (num1+num2+add)/10;
     * 2.移动位置
     * if(l1!=null) l1 = l1.next;
     * if(l2!=null) l2 = l2.next;
     * <p>
     * 3.返回结果
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int add) {
        if (l1 == null && l2 == null && add == 0) {
            return null;
        }
        int num1 = l1 == null ? 0 : l1.val;
        int num2 = l2 == null ? 0 : l2.val;
        ListNode listNode = new ListNode((num1 + num2 + add) % 10);
        add = (num1 + num2 + add) / 10;
        l1 = l1==null?null:l1.next;
        l2 = l2==null?null:l2.next;
        listNode.next = addTwoNumbers(l1,l2,add);
        return listNode;
    }
}
