package com.moopstudy.define;

public class MethodDemo4 {
    //判断一个整数是奇数还是偶数，并将判断的结果返回出来
    public static void main(String[] args) {
        isType(7);
        isType(8);

        int a=getSum(8);
        System.out.println(a);
        int b=getSum(10);
        System.out.println(b);

    }
    //判断一个数是奇数还是偶数
    public static void isType(int n) {
        if (n % 2 == 0) {
            System.out.println(n+"是偶数");
        } else {
            System.out.println(n+"是奇数");
        }
    }
    //求1~n的和
    public static int getSum(int n){
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=i;
        }
        System.out.print("1~"+n+"的和为：");
        return sum;
    }
}
