package com.moopstudy.arraytest;

public class ArrayDemo01 {

    // 某部门5名员工销售额分别为：16、26、36、6、100,请计算他们不么总销售额
    public static void main(String[] args) {

        int money[]={16,26,36,6,100};
        int sum=0;
        for (int i = 0; i < money.length; i++) {
            sum+=money[i];
        }
        System.out.println(sum);

    }
}
