package com.itheima.arraytest;

public class AyyayTest {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        int[] arr2={1,2,3,4,5,6,7};
        int[] arr3=new int[]{1,3,5,7,9};
        //取值
        System.out.println(arr[3]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        //赋值
        arr[3]=20;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}
