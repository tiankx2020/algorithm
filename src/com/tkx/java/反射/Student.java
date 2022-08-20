package com.tkx.java.反射;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月10日 16:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    public static String obj;
    private int id;
    private String name;
    private int age;
    public String nickName;
    //爱好
    List<String> hobby;
}
