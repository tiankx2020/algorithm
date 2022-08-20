package com.tkx.java.笔试题.腾讯音乐2022暑期;

import javax.swing.tree.TreeNode;
import java.util.Map;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月27日 19:16
 */
public class T2 {

    public static void main(String[] args) {
    }
    Map<Integer,TreeNode> map;
    // public TreeNode xorTree (TreeNode root, ArrayList<ArrayList<Integer>> op) {
    //     // write code here
    //     map = new HashMap<>();
    //     TreeNode p = root;
    //     order(root);
    //     for (ArrayList<Integer> list : op) {
    //         TreeNode node = map.get(list.get(0));
    //         int v = list.get(1);
    //         preOrder(node,v);
    //     }
    //     return p;
    // }

    // public void  order(TreeNode root){
    //     if(root!=null){
    //         map.put(root.val,root);
    //         root.val = 0;
    //         order(root.left);
    //         order(root.right);
    //     }
    // }
    // public void preOrder(TreeNode root,int v){
    //     if(root!=null){
    //         root.val = root.val^v;
    //         preOrder(root.left,v);
    //         preOrder(root.right,v);
    //     }
    // }
}
