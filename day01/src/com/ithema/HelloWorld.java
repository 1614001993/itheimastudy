package com.ithema;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        这是一行注释
        System.out.println("HelloWorld");
        System.out.println("HelloWorld1");

        /**
         *
         * 这是一个文档注释
         *
         * */

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        System.out.println(s1);




    }
}
