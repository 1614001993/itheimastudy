package com.abstracttest;
/*2、分析并完成以下需求:

        1.模拟计算器，提示用户选择运算方式，[1加法/2减法/3乘法/4除法/5取余/0退出程序]
        2.提示用户分别录入两个整数，然后根据运算方式进行计算
        3.打印用户选择的运算方式，和运算结果（使用字符串拼接算式和结果）*/

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择运算方式：[1加法/2减法/3乘法/4除法/5取余/0退出程序]");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("欢迎使用");
            return;
        }
        System.out.println("请输入第一个整数");
        int n1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int n2 = sc.nextInt();
        math(n, n1, n2);
    }

    public static void math(int n, int n1, int n2) {

        //根据输入的数字
        switch (n) {
            case 1:
                System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
                break;
            case 2:
                System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
                break;
            case 3:
                System.out.println(n1 + "*" + n2 + "=" + (n1 * n2));
                break;
            case 4:
                System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
                break;
            case 5:
                System.out.println(n1 + "%" + n2 + "=" + (n1 % n2));
                break;
            default:
                System.out.println("请输入正确的运算方式");
                break;

        }


    }
}
