package com.tkx.java.多线程;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月11日 10:22
 */
public class TestAQS {
    public static void main(String[] args) {
        MyLock myLock = new MyLock();
        new Thread(()->{
            myLock.lock();
            myLock.lock();
        },"t1").start();
    }
}

class MyLock implements Lock{
    private MySync sync = new MySync();
    class MySync extends AbstractQueuedSynchronizer{
        @Override
        protected boolean tryAcquire(int arg) {
            if(getExclusiveOwnerThread() == Thread.currentThread()){
                System.out.println("我是可重入锁，放行，喜喜");
                return true;
            }
            if(compareAndSetState(0,1)){
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        @Override
        protected boolean tryRelease(int arg) {
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }


        //是否持有独占锁
        @Override
        protected boolean isHeldExclusively() {
            return getState()==1;
        }
    }
    @Override
    public void lock() {
        sync.acquire(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {

    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
