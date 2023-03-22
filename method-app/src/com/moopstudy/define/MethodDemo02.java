package com.moopstudy.define;

public class MethodDemo02 {
    public static void main(String[] args) {
        //    目标：让所有人打印三行helloworld
        printHelloWorld();
        System.out.println("==============================");
        printN(8);
        System.out.println("==============================");
        scoreDemo(68.8);
        scoreDemo(58.8);
        System.out.println("==============================");
        System.out.println(scoreDemo1(68.8));
        System.out.println(scoreDemo1(58.8));
    }
    public static void printHelloWorld() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Helloworld");
        }
    }
    //输出指定行helloworld
    public static void printN(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Helloworld");
        }
    }
    //判断某个学生成绩是否合格，并打印结果
    public static void scoreDemo(double score) {
        if (score >= 60) {
            System.out.println("成绩合格");
        } else {
            System.out.println("成绩不合格");
        }
    }
    public static Boolean scoreDemo1(double score) {
        if (score >= 60) {
            return true;
        } else {
            return false;
        }
    }
}
