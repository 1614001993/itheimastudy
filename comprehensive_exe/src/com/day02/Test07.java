package com.day02;

import java.util.Scanner;

/*
07、分析并完成以下需求:

        1.我国的居民身份证号码，由17位数字本体码，和1位数字校验码组成  123456789123456789 123A56789123456789  023456789123456789 12345678912345678X
        2.请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果
        规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X
*/
public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        Boolean res=Demo1(n);
        System.out.println(res);
    }

    public static Boolean Demo1(String str) {
        char[] sfz = new char[str.length()];
        //将号码转换为字符串数组
        for (int i = 0; i < sfz.length; i++) {
            sfz[i] = str.charAt(i);
        }
        if (sfz.length != 18) {
            System.out.println("省份证号码由18位数字组成");
            return false;
        }
        if (sfz[0] == '0') {
            System.out.println("开头必须不能为0");
            return false;
        }
        //    判断省份证号码前17位位数字
        else {
            for (int i = 0; i < sfz.length - 1; i++) {
                if ('0' <= sfz[i] && sfz[i] <= '9') {
                    if (sfz[sfz.length - 1] == 'X' || (sfz[sfz.length - 1] <= '9' && sfz[sfz.length - 1] >= '0')) {
                        return true;
                    } else {
                        System.out.println("省份证最后一位必须为数字或者X");
                        return false;
                    }
                } else {
                    System.out.println("前17位必须由数字组成");
                    return false;
                }
            }

        }
        return true;
    }
}
