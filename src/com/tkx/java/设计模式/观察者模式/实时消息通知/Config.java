package com.tkx.java.设计模式.观察者模式.实时消息通知;

/**
 * 配置接口
 */
public interface Config {
    void ConfigChange();
    void notifySubscribes();
    //
    void attach(SubScribe subScribe);
    void cancel(SubScribe subScribe);
}
