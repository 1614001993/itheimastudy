package com.test;

// 13、分析并完成以下需求:
//
//         1.定义一个方法，该方法能在一个int类型数组中查询某元素num是否存在，并返回被查找元素的索引
//         2.main方法中定义一个数组arr={19,28,37,46,50}; 提示并使用键盘录入一个整数
//         3.调用方法，查询该整数是否在arr数组中，如果在打印索引，如果不在给出提示

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        int index = Demo1(n, arr);
    }

    public static int Demo1(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                System.out.println(i);
                return i;
            }
        }
        System.out.println("输入的数字不在这个数组");
        return -1;


    }
}
