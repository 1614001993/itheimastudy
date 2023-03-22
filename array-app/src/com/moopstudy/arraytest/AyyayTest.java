package com.moopstudy.arraytest;

public class AyyayTest {
    public static void main(String[] args) {
        // 定义一个数组
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
        //获取数组长度
        System.out.println(arr.length);
        System.out.println(arr2.length);
        System.out.println(arr3.length);
        //获取数组最大索引(数组长度减1)
        int maxIndex=arr.length-1;
        System.out.println(maxIndex);
        //为数组中的元素赋值
        arr[3]=20;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}
