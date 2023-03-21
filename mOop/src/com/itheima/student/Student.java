package com.itheima.student;

public class Student {
    String name;
    int chinese;
    int math;
    public  void getSum(){
        int sum=chinese+math;
        System.out.println(name+"的总成绩为："+sum);
    }
    public void getAve(){
        double ave=(chinese+math)/2.0;
        System.out.println(name+"的平均成绩为"+ave);
    }
}
