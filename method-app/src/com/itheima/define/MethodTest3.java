package com.itheima.define;

public class MethodTest3 {
    public static void main(String[] args) {
        int[] arr=new int[]{55,66,77,88,99};
        printArr(arr);

    }
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i<arr.length-1){
                System.out.print(arr[i]+",");
            }else {
                System.out.println(arr[i]+"]");
            }
        }

    }
}
