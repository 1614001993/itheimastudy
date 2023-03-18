package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class WorkDay04 {


    public static void main(String[] args) {
/*
	分析以下需求并完成代码 //暂时不写
		利用Random生成一个[10-100]之间的整随机数x，统计[10-x)之间奇数的个数
		最终在控制台打印所有的奇数以及个数
*/

        // Random random = new Random();
        // int num=random.nextInt(91)+10;
        // int count=0;
        // for (int i = 10; i <= num; i++) {
        //     if(i%2!=0){
        //         System.out.println(i);
        //         count++;
        //     }
        // }
        // System.out.println(count);


        /*
	分析以下需求并完成代码
		定义一个长度为5的int类型数组arr, 数组元素为[7-67]之间的随机整数
		遍历数组arr, 打印所有元素
		提示用户输入[3-5]之间的一个整数num, 输入数字不需要判断
		筛选出数组arr中是num倍数的元素, 并打印在控制台 (没有则打印结果为空)
*/

        // int[] arr=new int[5];
        // Random random = new Random();
        // for (int i = 0; i < arr.length; i++) {
        //     int num=random.nextInt(61)+7;
        //     arr[i]=num;
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        //
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("请输入3-5之间的整数");
        // int guest=scanner.nextInt();
        // int count=0;
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]%guest==0){
        //         System.out.println(arr[i]);
        //         count++;
        //     }
        // }
        // if(count==0){
        //     System.out.println("结果为空");
        // }


        /*
    分析以下需求并完成代码
        生成一个长度为10的数组, 元素为[1-100]之间的随机数, 遍历该数组
        按照偶数放右边奇数放左边(顺序不限)的规律, 将该数组元素重新排列到新数组, 并遍历新数组
*/
        int[] arr=new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num=random.nextInt(100)+1;
            arr[i]=num;
        }
        int[] arr1=new int[10];
        //偶数放右边，奇数放左边
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            if(arr[i]%2!=0){
                arr1[j]=arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                arr1[j]=arr[i];
                j++;
            }
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
