package com.tkx.java.笔试题.腾讯音乐2022暑期;

public class T1 {
    // public ArrayList<TreeNode> deleteLevel (TreeNode root, ArrayList<Integer> a) {
    //
    //     Set<Integer> set = new HashSet<>();
    //     for(int x:a){
    //         set.add(x);
    //     }
    //     ArrayList<TreeNode> list = new ArrayList<>();
    //     Queue<TreeNode> queue  =new LinkedList<>();
    //     if(root==null) return list;
    //     queue.add(root);
    //     int index = 0;
    //     while(queue.size()>0){
    //         index++;
    //         for(int i=queue.size();i>0;i--){
    //             TreeNode tmp = queue.remove();
    //
    //             if(set.contains(index)){
    //                 tmp.val = -1;
    //             }
    //             if(tmp.left!=null){
    //                 queue.add(tmp.left);
    //             }
    //             if(tmp.right!=null){
    //                 queue.add(tmp.right);
    //             }
    //         }
    //     }
    //     if(!set.contains(1)){
    //         list.add(root);
    //     }
    //     queue = new LinkedList<>();
    //     queue.add(root);
    //     while(queue.size()>0){
    //         for(int i=queue.size();i>0;i--){
    //             TreeNode tmp = queue.remove();
    //             if(tmp.val==-1){
    //                 if(tmp.left!=null && tmp.left.val!=-1){
    //                     list.add(tmp.left);
    //                 }
    //                 if(tmp.right!=null && tmp.right.val!=-1){
    //                     list.add(tmp.right);
    //                 }
    //             }
    //             if(tmp.left!=null){
    //                 queue.add(tmp.left);
    //             }
    //             if(tmp.right!=null){
    //                 queue.add(tmp.right);
    //             }
    //         }
    //     }
    //     index = 0;
    //     queue = new LinkedList<>();
    //     queue.add(root);
    //     Set<TreeNode> delSet = new HashSet<>();
    //     while (queue.size()>0){
    //         index++;
    //         for(int i=queue.size();i>0;i--){
    //             TreeNode tmp = queue.remove();
    //             if(set.contains(index+1)){
    //                 delSet.add(tmp);
    //             }
    //             if(tmp.left!=null){
    //                 queue.add(tmp.left);
    //             }
    //             if(tmp.right!=null){
    //                 queue.add(tmp.right);
    //             }
    //         }
    //     }
    //     for (TreeNode treeNode : delSet) {
    //         treeNode.left = null;
    //         treeNode.right = null;
    //     }
    //     return list;
    // }
}
