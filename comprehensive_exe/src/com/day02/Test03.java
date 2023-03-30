package com.day02;

import java.util.Scanner;

/*03、分析并完成以下需求:

        1.定义一个方法，实现交换int数组中，两个索引上的元素值，并调用方法，查看运行效果
        例如，数组为{11,22,33,44,55,66}，交换索引1和5位置上的元素，结果为{11,66,33,44,55,22}*/
public class Test03 {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55,66};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("请输入要交换的索引（输入的两个数字必须小于"+(arr.length-1)+"）");
        Scanner sc=new Scanner(System.in);
        System.out.println("输入第一个索引");
        int n1=sc.nextInt();
        System.out.println("输入第一个索引");
        int n2=sc.nextInt();
        int[] arr1=reverseArr(n1,n2,arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
    public static int[] reverseArr(  int n1,int n2,int[] arr){
        int temp=0;
        temp=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;
        return arr;
    }
}
