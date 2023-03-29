package com.apistudy.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();

     lists.add("枸杞王");
     lists.add("java入门到放弃");
     lists.add("宁夏枸杞");
     lists.add("大拖鞋");
     lists.add("黑枸杞");
     lists.add("枸杞子");
     lists.add("特级枸杞");
        for (int i = 0; i < lists.size(); i++) {
            System.out.print(lists.get(i)+" ");;
        }
        //顺着遍历
        // for (int i = 0; i < lists.size(); i++) {
        //     String str=lists.get(i);
        //     Boolean ifT=str.contains("枸杞");
        //     if(ifT){
        //         lists.remove(i);
        //         i--;
        //     }
        // }

        //倒着遍历
        for (int i = lists.size()-1; i >= 0; i--) {
            String str=lists.get(i);
            Boolean ifT=str.contains("枸杞");
            if(ifT){
                lists.remove(i);
            }

        }


        System.out.println();
        for (int i = 0; i < lists.size(); i++) {
            System.out.print(lists.get(i)+" ");;
        }
    }
}
