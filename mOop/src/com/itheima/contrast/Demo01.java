package com.itheima.contrast;

public class Demo01 {
    public static void printArr(int[] arr){
        System.out.print('[');
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.println(arr[i]+"]");
            }else{
                System.out.print(arr[i]+",");
            }
        }
    }
}
