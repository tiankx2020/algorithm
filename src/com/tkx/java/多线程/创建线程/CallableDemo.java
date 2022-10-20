package com.tkx.java.多线程.创建线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月04日 20:43
 */
public class CallableDemo implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("使用Callable创建线程");
        return 520;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableDemo demo  = new CallableDemo();
        FutureTask<Integer> task = new FutureTask<>(demo);
        Thread thread = new Thread(task);
        thread.start();
        Integer result = task.get();
        System.out.println(result);
    }
}
