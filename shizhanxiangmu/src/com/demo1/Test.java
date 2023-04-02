package com.demo1;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择要赌大还是赌小：1.赌大/2.赌小/3.退出");
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    System.out.println("您选择了赌大");
                    if(bigOrSmall(results()).equals("big")){
                        System.out.println("恭喜你。赢钱了~");
                    }else if(bigOrSmall(results()).equals("small")){
                        System.out.println("这把运气不好，输了~");
                    }else if(bigOrSmall(results()).equals("equal")){
                        System.out.println("庄家通杀~");
                    }
                    break;
                case 2:
                    System.out.println("您选择了赌小");
                    if(bigOrSmall(results()).equals("small")){
                        System.out.println("恭喜你。赢钱了~");
                    }else if(bigOrSmall(results()).equals("big")){
                        System.out.println("这把运气不好，输了~");
                    }else if(bigOrSmall(results()).equals("equal")){
                        System.out.println("庄家通杀~");
                    }
                    break;
                case 3:
                    System.out.println("程序结束");
                    return;
            }
        }
    }



    public static String bigOrSmall(int[] arr) {
        int sum = 0;
        String rs = "";
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (arr[0] == arr[1] & arr[1] == arr[2]) {
            System.out.println("三个点数一样，庄家通杀");
            return "equal";
        }
        if (sum < 11) {
            System.out.println("点数为小点");
            rs = "small";
        }
        if (sum >= 11) {
            System.out.println("点数为大点");
            rs = "big";
        }
        return rs;
    }
    //定义一个数组，存储随机生成的三个骰子的点数
    public static int[] results() {
        Random r = new Random();
        int a = r.nextInt(6) + 1;
        int b = r.nextInt(6) + 1;
        int c = r.nextInt(6) + 1;
        int[] arr = {a, b, c};
        printArray(arr);
        return arr;
    }

    //打印骰子点数的数组
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }
}
