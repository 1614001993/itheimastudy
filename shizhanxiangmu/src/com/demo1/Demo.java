package com.demo1;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // JFraime gui = new JFrame("赌大小");
        // gui.setVisible(true);
        // gui.setSize(600,900);
        do {
            System.out.println("======欢迎来到澳门大赌场======" + '\n' + "1：表示赌小");
            System.out.println("2：表示赌大");
            System.out.println("3：表示退出");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Demo1(n);
            if (n == 3) break;
        } while (true);
    }

    //判断大小
    public static void Demo1(int n) {
        int res1 = newShaiZi();
        switch (n) {
            case 1:
                System.out.println("您猜小");
                //生成正常数据
                if (res1 == 0) {
                    System.out.println("庄家为豹子,您输了");
                } else if (res1 < 11) {
                    System.out.println("恭喜您赢了");
                } else {
                    System.out.println("很遗憾，您输了");
                }
                break;

            case 2:
                System.out.println("您猜大");
                int res = newShaiZi();
                if (res == 0) {
                    System.out.println("庄家为豹子,您输了");
                } else if (res >= 11) {
                    System.out.println("恭喜您赢了");
                } else {
                    System.out.println("很遗憾，您输了");
                }
                break;
            case 3:
                System.out.println("退出");
                return;
            default:
                System.out.println("选择有误，您只能输入1，2,3来选择您要进行的操作：");
        }
    }

    //生成正常点数
    public static int newShaiZi() {
        int[] arr = new int[3];
        Random rd = new Random();
        //随机生成三个点数0~6
        System.out.print("生成的点数为：[");
        for (int i = 0; i < arr.length; i++) {
            int r = rd.nextInt(6) + 1;
            arr[i] = r;
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
        return getSum(arr);
    }

    //庄家出老千
    public static int[] newShaiZi(int n) {
        Random rd = new Random();
        int[] arr = new int[3];
        //豹子数的概率  种子
        int r = rd.nextInt(100);
        if (r < 20) {
            int x = rd.nextInt(6) + 1;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = x;
                return arr;
            }
        } else {
            //猜小了
            if (n == 1) {
                int x = rd.nextInt(6) + 1;
                for (int i = 0; i < arr.length; i++) {
                    for (int i1 = 0; i1 < arr.length; i1++) {

                    }
                }
            }
        }
        return arr;
    }

    //对生成的点数分析，如果是豹子返回0，否则返回sum
    public static int getSum(int[] arr) {
        int sum = 0;
        if (arr[0] == arr[1] && arr[1] == arr[2]) {
            return 0;
        } else {
            for (int i = 0; i < arr.length; i++) {
                //判断是否为豹子
                sum += arr[i];
            }
            return sum;
        }
    }
}
