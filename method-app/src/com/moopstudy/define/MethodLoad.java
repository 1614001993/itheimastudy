package com.moopstudy.define;

import java.util.Random;

public class MethodLoad {

/*    public static void main(String[] args) {

    }
    public static void Demo1(){

    }
    public static int Demo1(int a,int b){
        return a+b;
    }
    public static int Demo1(int a,int b,int c){
        return a+b+c;
    }
    void Demo1(int a){

    }*/


    public static void main(String[] args) {
            Demo1();
    }
    public static void Demo1(){

        int[] arr=new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num=random.nextInt(100)+1;
            arr[i]=num;
        }
        int[] arr1=new int[arr.length];
        //偶数放右边，奇数放左边
        for (int i = 0,j=0,k=arr.length-1; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            if(arr[i]%2!=0){
                arr1[j]=arr[i];
                j++;
            }
            else if(arr[i]%2==0){
                arr1[k]=arr[i];
                k--;
            }
        }

        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
