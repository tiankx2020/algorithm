package com.tkx.java.牛客top100.链表;

import com.tkx.java.ListNode;

import java.util.ArrayList;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月17日 20:58
 */
public class BM5合并k个已排序的链表 {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        return  divide(lists,0,lists.size()-1);
    }

    //重点
    public ListNode divide(ArrayList<ListNode> lists,int left,int right){
        if(left>right) return null;
        if(left == right) return lists.get(left);
        int mid = (left+right)/2;
        return merge(divide(lists,left,mid),divide(lists,mid+1,right));
    }

    private ListNode merge(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        if(list1.val<= list2.val){
            list1.next = merge(list1.next,list2);
            return  list1;
        }else{
            list2.next = merge(list1,list2.next);
            return  list2;
        }
    }
}
