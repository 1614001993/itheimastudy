package com.moopstudy.define;

public class MethodDemo3 {
    //    求1~n的值
    public static void main(String[] args) {
//

        int sum=getSum(100);
        System.out.println(sum);
    };


    public static int getSum(int n) {
        int sum=0;
        for (int i = 0; i <= n; i++) {
            sum+=i;
        }
    return sum;
    };
}
