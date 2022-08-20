package com.tkx.java.笔试题.腾讯2022;



/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月24日 20:04
 */
public class T2 {
    // public ListNode solve(ListNode[] a){
    //     ArrayDeque<Integer> queue = new ArrayDeque<>();
    //     ListNode p = a[0];
    //     //1.先找出完成的链表，将链表放入到队列中
    //     // 如实例1  队列中这时候的值就为 1，2，3，4
    //     while (p!=null){
    //         queue.addLast(p.val);
    //         p = p.next;
    //     }
    //     boolean f = true;
    //     while(f){
    //         for(int i=1;i<a.length && f;i++){
    //             ListNode tmp = a[i];
    //             while (tmp!=null){
    //                 if(tmp.val==queue.getLast()){
    //                     if(tmp.next!=null){
    //                         if(tmp.next.val!=queue.getFirst()){
    //                             queue.add(tmp.next.val);
    //                         }else{
    //                             f = false;
    //                             break;
    //                         }
    //                     }
    //                 }
    //                 tmp = tmp.next;
    //             }
    //         }
    //     }
    //     //将队列放入到list中
    //     List<Integer> list =  new ArrayList<>(queue);
    //     int min = 99999999;
    //     //2.找到list中最小的值，就是返回结果的头节点
    //     for(int i=0;i<list.size();i++){
    //         min = Math.min(min,list.get(i));
    //     }
    //     ListNode head = null;
    //     //3.构建链表
    //     for(int i=0;i<list.size();i++){
    //         if(list.get(i)==min){
    //             head = new ListNode(min);
    //             ListNode tail = head;
    //             for(int j=i+1;j<i+list.size();j++){
    //                 ListNode q = new ListNode(list.get(j%list.size()));
    //                 tail.next = q;
    //                 tail = tail.next;
    //             }
    //             break;
    //         }
    //     }
    //     //4.返回结果
    //     return  head;
    // }
}
