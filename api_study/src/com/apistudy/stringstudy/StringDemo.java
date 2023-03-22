package com.apistudy.stringstudy;

public class StringDemo {
    public static void main(String[] args) {

        //直接定义String类型的变量
        String s0="这是字符串0";
        System.out.println(s0 );
        //无参构造
        String s = new String();
        System.out.println(s);
    //String类型的构造器
        String s1 = new String("这是一个字符串");
        System.out.println(s1);

        //char 类型的构造器
        char[] arr={'这','是','一','个','字','符','串'};
        String s2 = new String(arr);
        System.out.println(s2);

    //    byte[] 类型的构造器
        byte[] arr1={97,98,99,100};
        String s3 = new String(arr1);
        System.out.println(s3);


    }
}
