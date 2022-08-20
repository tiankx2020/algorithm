package com.tkx.java.牛客top100.链表;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月17日 21:34
 */
public class BM11链表相加二 {
    /*
        解题思路: 1.先将两个链表反转
                 2.对反转后的两个链表做加法(注意要加一个进位数add)
                 3.对相加结果做反转运算
    //  */
    // public ListNode addInList(ListNode head1, ListNode head2) {
    //     head1 = reverseLinkedList(head1);
    //     head2 = reverseLinkedList(head2);
    //     ListNode node  =  addLinkedList(head1,head2);
    //     return  reverseLinkedList(node);
    // }
    // public ListNode addLinkedList(ListNode head1,ListNode head2){
    //     ListNode node = new ListNode(-1);
    //     ListNode head = node;
    //     int add= 0;
    //     while(head1!=null || head2!=null){
    //         if(head1!=null && head2!=null){
    //             add = head1.val+head2.val+add;
    //             node.next =  new ListNode(add%10);
    //             node = node.next;
    //             head1 = head1.next;
    //             head2 = head2.next;
    //         }
    //         else if(head1==null){
    //             add = head2.val+add;
    //             node.next = new ListNode(add%10);
    //             node = node.next;
    //             head2 = head2.next;
    //         }
    //         else if(head2==null){
    //             add = head1.val+add;
    //             node.next = new ListNode(add%10);
    //             node = node.next;
    //             head1 = head1.next;
    //         }
    //         add/=10;
    //     }
    //     if(add>0){
    //         node.next = new ListNode(add);
    //     }
    //     return head.next;
    // }
    // public ListNode reverseLinkedList(ListNode node){
    //     if(node == null || node.next == null) return node;
    //     ListNode p = node,q=node.next;
    //     p.next = null;
    //     while(q!=null){
    //         ListNode tmp = q.next;
    //         q.next = p;
    //         p=q;
    //         q= tmp;
    //     }
    //     return p;
    // }
}
