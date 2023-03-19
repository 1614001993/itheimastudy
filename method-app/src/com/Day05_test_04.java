package com;

import java.util.Scanner;

public class Day05_test_04 {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        int recive=Demo1(arr);
        System.out.println(recive);
    }
    /*
	分析以下需求并完成代码
		设计一个方法, 用来判断一个整数是否在某个数组中，
		如果在则返回该整数在数组中的索引, 如果不在则返回-1
		在main方法中调用该方法完成测试
*/
    public static int Demo1(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入值");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                return i;
            }
            // else{
            //     return -1;
            // }
        }
        return -1;
    }
}
