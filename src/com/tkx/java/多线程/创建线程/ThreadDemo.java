package com.tkx.java.多线程.创建线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月12日 14:09
 */
public class ThreadDemo {
    public static void main(String[] args) throws Exception {
        FutureTask<Integer> task = new FutureTask<>(()->{
            System.out.println("hello");
            return 100;
        });
        new Thread(task,"t1").start();

        int  result= task.get();
        System.out.println(result);

        Demo demo = new Demo();
        Object call = demo.call();
        System.out.println(call);
    }
}


class Demo implements Callable {

    @Override
    public Object call() throws Exception {
        return "hello";
    }
}
