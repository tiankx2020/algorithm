package com.tkx.java.牛客top100.二叉树;

import com.tkx.java.剑指offer.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月17日 22:51
 */
public class BM26求二叉树的层序遍历 {
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return list;
        queue.add(root);
        while (queue.size()>0){
            ArrayList<Integer> tmp = new ArrayList<>();
            for(int i=queue.size();i>0;i--){
                TreeNode t = queue.poll();
                tmp.add(t.val);
                if(t.left!=null){
                    queue.add(t.left);
                }
                if(t.right!=null){
                    queue.add(t.right);
                }
            }
            list.add(tmp);
        }
        return list;
    }
}
