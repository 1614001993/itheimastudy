package com.itheima.ifswitch;

public class IfDemo {
    public static void main(String[] args) {
        //检测体温
        int tem = 36;
        if (tem > 37) {
            System.out.println("体温异常");
        } else {
            System.out.println("体温正常");
        }
        //检测余额
        double money = 100;
        if (money >= 100) {
            System.out.println("转账成功");
        } else {
            System.out.println("转账失败，余额不足");
        }
        //绩效打分
        int score = 66;
        if (score > 95 && score < 100) {
            System.out.println('A');
        } else if (90 < score && score <= 95) {
            System.out.println('B');
        } else if (score > 0 && score <= 90) {
            System.out.println('C');
        } else {
            System.out.println("成绩考核有误");
        }
    }
}
