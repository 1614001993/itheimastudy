package com.itheima.define;

public class MethodDemo4 {
    //判断一个整数是奇数还是偶数，并将判断的结果返回出来
    public static void main(String[] args) {
        String a = isType(5);
        System.out.println(a);
        String b = isType(0);
        System.out.println(b);
        String c = isType(6);
        System.out.println(c);
        String d = isType(-1);
        System.out.println(d);
        String e = isType(-4);
        System.out.println(e);

    }

    public static String isType(int n) {
        if (n % 2 == 0) {
            return "偶数";
        } else {
            return "奇数";
        }
    }
}
