package com.itheima.memory;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int a=20;
        System.out.println(a);
        int arr[]=new int[]{1,2,3,4,5,6};
        System.out.println(arr);

    //    多个变量指向同一个地址
        int[] arr2=arr;
        System.out.println(arr2);  //arr2与arr指向同一个地址[I@776ec8df

        arr2[1]=30;     //多个变量指向同一个地址时，对其中一个变量进行数组修改或者赋值，则其他变量访问这个数组时得到的是最新的值。
        System.out.println(arr[1]);
        int[] arr3=arr;
        arr3=null;
        System.out.println(arr3);
        System.out.println(arr);
    }
}
