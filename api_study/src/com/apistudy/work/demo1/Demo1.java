package com.apistudy.work.demo1;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String n = sc.next();
        Demo1(n);
    }

    public static void Demo1(String n) {
        char[] arr = n.toCharArray();
        int num = 0;
        int daxie = 0;
        int xiaoxie = 0;
        int other = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) <= '9' && n.charAt(i) >= '0') {
                num++;
            } else if (n.charAt(i) <= 'z' && n.charAt(i) >= 'a') {
                xiaoxie++;
            } else if (n.charAt(i) <= 'Z' && n.charAt(i) >= 'A') {
                daxie++;
            } else {
                other++;
            }
        }
        System.out.println("大写有"+daxie+"个");
        System.out.println("小写有"+xiaoxie+"个");
        System.out.println("数字写有"+num+"个");
        System.out.println("其他字符有"+other+"个");


    }
}
