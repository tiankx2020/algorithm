package com.tkx.java.leecode周赛.安贤311;

import com.tkx.java.剑指offer.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月19日 16:02
 */
public class T3 {
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int index = 0;
        while (queue.size()>0) {
            Stack<Integer> stack = new Stack<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode tmp = queue.poll();
                stack.push(tmp.val);
                queue.add(tmp);
            }

            for (int i = queue.size(); i > 0; i--) {
                TreeNode tmp = queue.poll();
                if(index%2==1){
                    tmp.val = stack.pop();
                }
                if(tmp.left!=null){
                    queue.add(tmp.left);
                }
                if(tmp.right!=null){
                    queue.add(tmp.right);
                }
            }
            index++;
        }
        return  root;
    }
}
