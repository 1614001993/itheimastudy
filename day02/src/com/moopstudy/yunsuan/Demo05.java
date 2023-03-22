package com.moopstudy.yunsuan;

public class Demo05 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;
//        逻辑与 &
        System.out.println(a > b && a <= 10);   //false
//        逻辑或 |
        System.out.println(a > b || a <= 10);   //true
//        逻辑非！
        System.out.println(!(a > b));        //true
//        逻辑异或^(两边结果相同返回false，否则返回true)
        System.out.println(true ^ true);   //false
        System.out.println(false ^ false);  //flase
        System.out.println(true ^ false);   //true

//        &&
        int d=10;
        System.out.println(d > b && d++ > c);   //false
        System.out.println(d);                  //10
        System.out.println(d<b&& d++ >c);       //false
        System.out.println(d);                  //11

//        ||
        int e=10;
        System.out.println(e<b || e++>c);      //true
        System.out.println(e);                 //10
        System.out.println(e>b || e++>c);      //true
        System.out.println(e);                 //11
//      三元运算符
        int x=40;
        int y=50;
        char z=x>y?'是':'否';
        System.out.println(z);

    }
}
