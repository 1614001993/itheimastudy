package com.itheima.define;

public class MethodDemo5 {
    //引用类型的参数传递
    public static void main(String[] args) {
        int[] arr={12,13,15};
        printArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }



     }


     public static void printArr(int[] arr1){

         arr1[1]=33;
         for (int i = 0; i < arr1.length; i++) {
             System.out.print(arr1[i]);
         }
         System.out.println("++++++++++++");
     }
}
