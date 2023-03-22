package com.moopstudy.define.demo;

public class ShowArr {

    //将一个数组以[11,22,33,44,55]的方式展示出来
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
