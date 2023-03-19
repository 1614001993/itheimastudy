package com;

public class Day05_test_03 {
 /*
	分析以下需求并完成代码
	设计一个方法, 接收一个整数数组, 同时返回该数组的最大值和最小值
*/
    public static void main(String[] args) {
        int[] arr={3,7,1,10,19,8};
        int[] arr1=Demo1(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
    public static int[] Demo1(int[] arr){
        int[] arr1=new int[2];
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
                arr1[0]=max;
            }
            if (arr[i]<min){
                min=arr[i];
                arr1[1]=min;
            }

        }
        return arr1;
    }
}
