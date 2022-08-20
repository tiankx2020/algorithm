package com.tkx.java.多线程.终止线程;

import java.net.ServerSocket;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月10日 16:17
 */
public class ServerThread extends Thread {
    //volatile修饰符用来保证其它线程读取的总是该变量的最新的值
    public volatile boolean exit = false;

    @Override
    public void run() {
        while(!exit){
            System.out.println(1);
        }
    }

    public static void main(String[] args) {
        ServerThread t = new ServerThread();
        t.start();

        t.exit = true; //修改标志位，退出线程
    }
}
