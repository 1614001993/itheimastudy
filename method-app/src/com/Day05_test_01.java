package com;

import java.util.Random;

public class Day05_test_01 {
    public static void main(String[] args) {
        int[] arr={1,4,7,9,5,8};
        Demo1(arr);
    }
    /*
	分析以下需求并完成代码
		设计一个方法, 接收一个整数数组, 完成数组元素打乱
*/
    public static void Demo1(int[] arr){
        Random random = new Random();
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            int rd=random.nextInt(arr.length);
            tmp=arr[i];
            arr[i]=arr[rd];
            arr[rd]=tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
