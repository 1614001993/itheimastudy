package com.day02;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Demo1();
// Demo2();

    }
    //方法一
    public static void Demo1(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("请输入整数：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (i == arr.length-1) {
                i = -1;
            }
            for (int i1 = 0; i1 < arr.length; i1++) {
                System.out.print(arr[i1]+" ");
            }
        }
    }
    // 方法二
    // public static void Demo2(){
    //     Scanner sc = new Scanner(System.in);
    //     int[] arr = new int[5];
    //     System.out.println("请输入整数：");
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = sc.nextInt();
    //         //当数组赋值完成的时候，将arr[1]的值赋给arr[0]
    //         while(true){
    //             if (i == arr.length-1) {
    //                 for (int i1 = 0; i1 < arr.length-1; i1++) {
    //                     arr[i1]=arr[i1+1];
    //                 }
    //             }
    //             for (int i1 = 0; i1 < arr.length; i1++) {
    //                 System.out.print(arr[i1]+" ");
    //             }
    //         }
    //     }
    // }

}
