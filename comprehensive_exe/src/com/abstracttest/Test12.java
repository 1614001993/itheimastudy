package com.abstracttest;

import java.util.Random;
import java.util.Scanner;

/*12、分析并完成以下需求:

        1.定义一个长度为5的int类型数组arr，数组元素为[7-67]之间的随机整数
        2.遍历数组arr，打印所有元素
        3.提示用户输入[3-5]之间的一个整数num，输入数字不需要判断
        4.筛选出数组arr中是num倍数的元素，并打印在控制台*/
public class Test12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();

        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=rd.nextInt(61)+7;
        }
        System.out.println("请输入一个3~5之间的数字：");
        int n=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            if(arr[i]%n==0){
                System.out.println(arr[i]);
            }
        }
    }
}
