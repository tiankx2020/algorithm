package com.tkx.java.设计模式.观察者模式.实时消息通知;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 订阅者,需要被通知的人
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubScribe {
    private Integer id;
    private String name;


    public void getMessage(){
        System.out.println(name+"我得到通知了");
    }
}
