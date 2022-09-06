package com.tkx.java.笔试题.游卡;

import com.tkx.java.剑指offer.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月06日 19:06
 */
public class T2 {
    List<TreeNode> tmp;
    public ArrayList<TreeNode> findCommonAncestors2 (TreeNode root, TreeNode p, TreeNode q) {
        // write code here
        tmp = new ArrayList<>();
        List<TreeNode> list1 = new ArrayList<>();
        List<TreeNode> list2 = new ArrayList<>();
        preOrder(root, p, list1);
        preOrder(root, q, list2);
        System.out.println("size1:"+list1.size());
        System.out.println("size2:"+list2.size());
        for (TreeNode treeNode : list1) {
            System.out.println(treeNode.val);
        }
        System.out.println("------------------");
        for (TreeNode treeNode : list2) {
            System.out.println(treeNode.val);
        }
        ArrayList<TreeNode> res = new ArrayList<>();
        for (int i = 0; i < list1.size() && i < list2.size(); i++) {
            if (list1.get(i) == list2.get(i)) {
                res.add(new TreeNode(list1.get(i).val));
            } else {
                break;
            }
        }
        return res;
    }


    public void preOrder(TreeNode node, TreeNode p, List<TreeNode> list) {
        if (node != null) {
            tmp.add(node);
            if (node.val == p.val) {
                for (TreeNode treeNode : tmp) {
                    list.add(treeNode);
                }
            }
            preOrder(node.left, p, list);
            preOrder(node.right, p, list);
            tmp.remove(tmp.size() - 1);
        }
    }
}
