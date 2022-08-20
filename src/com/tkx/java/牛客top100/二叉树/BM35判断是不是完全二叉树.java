package com.tkx.java.牛客top100.二叉树;

import com.tkx.java.剑指offer.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月18日 11:31
 */
public class BM35判断是不是完全二叉树 {
    public boolean isCompleteTree (TreeNode root) {
        // write code here
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null)  return true;
        queue.add(root);
        boolean flag = false;
        while (queue.size()>0){
            for(int i=queue.size();i>0;i--){
                TreeNode tmp = queue.poll();
                if(tmp==null){
                    flag = true;
                    continue;
                }
                //层次遍历 空结点后面还有非空结点，说明不是完全二叉树
                if(flag == true) return false;
                queue.add(tmp.left);
                queue.add(tmp.right);
            }
        }
        return true;
    }
}
