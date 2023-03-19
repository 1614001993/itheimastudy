package com;

public class Day05_test_02 {
    public static void main(String[] args) {
        int[] arr = {22, 33, 44, 55, 66, 77};
        Demo1(arr);
    }

    /*
        分析以下需求并完成代码
        设计一个方法, 接收一个整数数组, 将数组元素按如下格式打印
        [1, 2, 3, 4, 5]
    */
    public static void Demo1(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

}
