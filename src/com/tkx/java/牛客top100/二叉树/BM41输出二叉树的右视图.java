package com.tkx.java.牛客top100.二叉树;

import com.tkx.java.剑指offer.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
    思路：二叉树的右视图：对应的是程序遍历的最后一个结点。
    我们可以遍历层次遍历的左右循序，就相当于取每一层的第一个结点
 */
public class BM41输出二叉树的右视图 {

    public int[] solve (int[] xianxu, int[] zhongxu) {
        // write code here
        TreeNode root = createTree(xianxu,0,xianxu.length-1,zhongxu,0,zhongxu.length-1);
        List<Integer> list = new ArrayList<>();
        if(root==null) return  new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            for(int i=queue.size();i>0;i--){
                TreeNode tmp = queue.poll();
                System.out.println(tmp.val);
                if(i==queue.size()){
                    list.add(tmp.val);
                }
                if(tmp.right!=null){
                    queue.add(tmp.right);
                }
                if(tmp.left!=null){
                    queue.add(tmp.left);
                }
            }
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
    public TreeNode createTree(int[] pre,int l1,int r1,int[] vin,int l2,int r2){
        if(l1>r1) return null;
        TreeNode root = new TreeNode(pre[l1]);
        int index=-1;
        //找到先序遍历中的第一个结点在中序遍历中的位置
        for(int i=l2;i<=r2;i++){
            if(vin[i]==pre[l1]){
                index=i;
                break;
            }
        }
        int len  = index-l2;
        root.left = createTree(pre,l1+1,l1+len,vin,l2,l2+len-1);
        root.right= createTree(pre,l1+len+1,r1,vin,l2+len+1,r2);
        return root;
    }
}
