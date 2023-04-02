package com.abstracttest;
/*3、分析并完成以下需求:

        1.使用随机数生成一个[1-100]的整数，提示用户猜一个整数
        2.根据用户猜的整数，与随机数比较判断，打印用户猜的结果（猜对了或猜小了、猜大了）
        3.多次游戏，猜对了停止游戏*/

import java.util.Random;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        guessNum();

    }
    public static void guessNum(){
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        int r=rd.nextInt(101);
        System.out.println("请输入您猜测的数字：");
        int n=sc.nextInt();
        while(true){
            if(n>r){
                System.out.println("您猜大了,请重新输入：");
                n=sc.nextInt();
            }else if(n<r){
                System.out.println("您猜小了,请重新输入：");
                n=sc.nextInt();
            }else{
                System.out.println("您猜对了");
                break;
            }
        }
    }
}
