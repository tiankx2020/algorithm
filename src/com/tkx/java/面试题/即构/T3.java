package com.tkx.java.面试题.即构;

import com.tkx.java.ListNode;
import jdk.internal.org.objectweb.asm.tree.analysis.Analyzer;
import jdk.nashorn.internal.parser.TokenStream;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月25日 9:36
 */
public class T3 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2= new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        output(node1);
    }

    public static void output(ListNode node){
        try
        {
            FileOutputStream fileOut =
                    new FileOutputStream("E:\\1.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(node);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in E:\\1.ser");
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }
}
