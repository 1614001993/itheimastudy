package com.moopstudy.define;

public class MethodTest {
    public static void main(String[] args) {
        int a=10;
        int b=40;
        getSum(a,b);
        System.out.println(getSum(a,b));
    }
    public static int getSum(int a,int b){
        return a+b;
    }
};

