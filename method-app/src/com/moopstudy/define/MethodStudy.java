package com.moopstudy.define;

public class MethodStudy {
    public static void main(String[] args) {
        int[] arr={11,22,33,44};
        System.out.println(arr[1]);
        System.out.println(arr);
        testArr(arr);
        System.out.println("调用方法之后，arr[1]的值发生变化");
        System.out.println(arr[1]);
    }
    public static void testArr(int[] arr){
        System.out.println("++++++++++++++");
        System.out.println(arr);
        System.out.println(arr[1]);
        arr[1]=333;
        System.out.println(arr[1]);


    }

}
