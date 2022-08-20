package com.tkx.java.每日一题;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月01日 19:26
 */
public class T1305 {


    // public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
    //     List<Integer> list1 = new LinkedList<>();
    //     List<Integer> list2 = new LinkedList<>();
    //     inOrder(root1, list1);
    //     inOrder(root2, list2);
    //     return  merger(list1,list2);
    // }
    //
    // public List<Integer> merger(List<Integer> list1, List<Integer> list2) {
    //     List<Integer> ans = new ArrayList<>();
    //     int i=0,j=0;
    //     while (i<list1.size() && j<list2.size()){
    //         if(list1.get(i)<=list2.get(j)){
    //             ans.add(list1.get(i++));
    //         }else{
    //             ans.add(list2.get(j++));
    //         }
    //     }
    //     while (i<list1.size()) ans.add(list1.get(i++));
    //     while (j<list2.size()) ans.add(list2.get(j++));
    //     return  ans;
    // }
    //
    // public void inOrder(TreeNode treeNode, List<Integer> list) {
    //     if (treeNode != null) {
    //         inOrder(treeNode.left, list);
    //         list.add(treeNode.val);
    //         inOrder(treeNode.right, list);
    //     }
    // }
}
