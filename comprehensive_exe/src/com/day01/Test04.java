package com.day01;
// 4、分析并完成以下需求:
//
//         1.获取一个[10-100]之间的int类型随机数num，统计[10-num]之间，奇数的个数
// [10-25]
//         2.最终在控制台打印所有的奇数，和个数

import java.util.Random;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        System.out.println("请输入您要统计的最大范围(100以内)");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random rd = new Random();
        // [10-num]之间
        int r = rd.nextInt(n - 9) + 10;
        getJiShu(n, r);
    }

    public static void getJiShu(int n, int r) {
        int count = 0;
        for (int i = 10; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
                count++;
                //5个为1行
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("奇数有" + count + "个");
    }
}
