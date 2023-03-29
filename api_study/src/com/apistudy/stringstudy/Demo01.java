package com.apistudy.stringstudy;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Demo1();
    }
    //    调用登录方法，来控制登陆三次
    public static void Demo1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String user = sc.next();
        System.out.print("请输入密码：");
        String pass = sc.next();
        for (int i = 0; i <3; i++) {
            Boolean suc = userPass(user, pass);
            if (suc) {
                System.out.println("登录成功，欢迎进入系统");
                break;
            } else {
                if (i == 2) {
                    System.out.println("三次输入错误，请检查您的账号或者密码是否正确");
                    break;
                }
                System.out.println("密码错误，请重新输入,您还有"+(2-i)+"次机会");
                pass = sc.next();
            }
        }

    }

    //    判断用户名密码是否匹配
    public static Boolean userPass(String user, String pass) {
        String use = "itheima";
        String pas = "123456";
        if (pas.equals(pass) && use.equals(user)) {
            return true;
        }
        return false;
    }
}
