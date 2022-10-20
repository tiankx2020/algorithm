package com.tkx.java.秋招笔试题.古茗;

import java.io.*;
import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月17日 19:30
 */
public class T1 {
    public static void main(String[] args) throws FileNotFoundException {

        // map用来记录每个单词的数量
        Map<String,Integer> map = new HashMap<>();
        // path.txt为读取的文件
        File file = new File("path.txt");
        // 计算每个单词的数量
        Reader reader = null;
        StringBuilder sb = new StringBuilder();
        try {
            reader = new InputStreamReader(new FileInputStream(file));
            int tmp;
            while ((tmp = reader.read()) != -1) {
                if (tmp>='a' && tmp<='z' || tmp>='A' && tmp<='Z') {
                    sb.append((char) tmp);
                } else {
                    // 计算单词的数量
                    String word = sb.toString().toLowerCase();
                    Integer count = map.get(word);
                    if (count == null) {
                        map.put(word, 1);
                    } else {
                        map.put(word, count + 1);
                    }
                    sb = new StringBuilder();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        String[][] numArr = new String[map.size()][2];
        int index =0;
        for (String word:map.keySet()){
            // 保存单词
            numArr[index][0] =word;
            // 保存单词的数量
            numArr[index][1] = String.valueOf(map.get(word));
            index++;
        }
        // 根据每个单词的数量进行降序
        Arrays.sort(numArr,(a,b)->{
           return Integer.valueOf(b[1])-Integer.valueOf(b[0]);
        });
        for(int i=0;i<10;i++){
            System.out.println(numArr[i][0]);
        }
    }
}
