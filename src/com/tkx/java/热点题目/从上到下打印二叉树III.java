package com.tkx.java.热点题目;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月10日 21:58
 */
public class 从上到下打印二叉树III {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if(root==null) return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int index = 0;
        while(queue.size()>0){
            List<Integer> list = new LinkedList<>();
            for(int k= queue.size();k>0;k--){
                TreeNode tmp = queue.remove();
                list.add(tmp.val);
                if(tmp.left!=null) queue.add(tmp.left);
                if(tmp.right!=null) queue.add(tmp.right);
            }
            index++;
            if(index%2==0)
            Collections.reverse(list);
            ans.add(new ArrayList<>(list));
        }
        return ans;
    }
}
