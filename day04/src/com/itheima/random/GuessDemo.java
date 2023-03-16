package com.itheima.random;

import java.util.Random;
import java.util.Scanner;

public class GuessDemo {
    public static void main(String[] args) {
        //生成一个1~100之间的数，让用户猜测，直到猜中为止
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int num = random.nextInt(100) + 1;
        for (; ; ) {
            System.out.print("请输入您猜测的数字[1~100]：");
            int guess = scanner.nextInt();
            if(guess<=100&&guess>=1){
                if (guess == num) {
                    System.out.println("您猜对了");
                    break;
                } else if (guess > num) {
                    System.out.println("您猜大了");
                } else if (guess < num) {
                    System.out.println("您猜小了");
                }
            }  else{
                System.out.println("请输入范围内的数字");
            }
        }

    }


}

