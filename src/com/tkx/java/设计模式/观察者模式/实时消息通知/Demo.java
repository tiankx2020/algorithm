package com.tkx.java.设计模式.观察者模式.实时消息通知;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class Demo {
    public static void main(String[] args) {
        // 这一步可以优化一下
        SubScribe zs = new SubScribe(1,"张三");
        SubScribe ls = new SubScribe(2,"李四");
        SubScribe zw = new SubScribe(3,"王五");
        List<SubScribe> list = new ArrayList<>();
        list.add(zs);
        list.add(ls);
        list.add(zw);
        ConfigImpl config = new ConfigImpl();
        config.setSubScribes(list);
        // 广告配置发生改变
        config.ConfigChange();
        config.cancel(ls);
        System.out.println("-------------------");
        config.ConfigChange();

    }
}
