package com.test01;

/*

题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
        程序分析：(a>b)?a:b这是条件运算符的基本例子。
*/

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int n = sc.nextInt();
        if(n>100||n<0){
            System.out.println("成绩错误");
        }
        else{
            String str=n>=60?(n<90?"B":"A"):"C";
            System.out.println(str);
        }
    }

}
