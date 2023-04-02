package com.abstracttest;
/*1、分析并完成以下需求:

        1.商场根据消费金额不同，折扣也不同，折扣的规则如下（P代表消费的总金额）
        P >= 2000 7折
        1000 <= P < 2000 8折
        500 <= P < 1000 9.5折
        P < 500 不打折
        2.要求根据输入的消费金额，输出对应的折扣和折扣前后的金额*/

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的消费金额：");
        double n = sc.nextDouble();
        Price(n);
    }

    public static void Price(double n) {
        double price;
        if (n > 0 && n <= 500) {
            System.out.println("未达到打折金额");
        } else if (n < 1000 ) {
            price = n * 0.95;
            System.out.println("打九五折，打折后的金额为：" + price);
        } else if (n < 2000 ) {
            price = n * 0.95;
            System.out.println("打八折，打折后的金额为：" + price);
        } else if (n >= 2000) {
            price = n * 0.7;
            System.out.println("打七折，打折后的金额为：" + price);
        } else {
            System.out.println("金额有误");
        }
    }


}
