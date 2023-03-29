package com.apistudy.work.demo1;

import java.util.ArrayList;

public class test {
    // public static void main(String[] args) {
    //     ArrayList<String> list = new ArrayList<>();
    //     list.add(123);
    //     list.add("456");
    //     System.out.println(list);
    // }
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        String s = "黑马程序员";
        String s2 = s;
        System.out.println(a == b);
        System.out.println(s == s2);
    }
}
