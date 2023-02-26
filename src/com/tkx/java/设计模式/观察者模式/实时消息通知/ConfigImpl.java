package com.tkx.java.设计模式.观察者模式.实时消息通知;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2023年02月26日 9:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigImpl implements Config{

    private List<SubScribe> subScribes = new ArrayList<>();

    @Override
    public void ConfigChange() {
        System.out.println("配置改变开始");
        /**
         * 相关代码
         */
        System.out.println("配置改变结束");
        notifySubscribes();
    }

    @Override
    public void notifySubscribes() {
        // 状态发生改变进行通知
        subScribes.forEach(e->e.getMessage());
    }

    /**
     * [订阅] 添加订阅者
     * @param subScribe
     */
    @Override
    public void attach(SubScribe subScribe) {
        // 添加完成
        subScribes.add(subScribe);
    }

    @Override
    public void cancel(SubScribe subScribe) {
        for (int i = 0; i < subScribes.size(); i++) {
            if(subScribe.getId() == subScribes.get(i).getId()){
                // 找到了退订者
                subScribes.remove(i);
                System.out.println("退订完成");
                break;
            }
        }

    }


}
