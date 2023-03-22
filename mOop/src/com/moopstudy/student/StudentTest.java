package com.moopstudy.student;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        Student s1=new Student();
        //使用对象（存储）
        s1.name="张三";
        s1.chinese=83;
        s1.math=87;
        s1.getSum();
        s1.getAve();

        Student s2=new Student();
        s2.name="李四";
        s2.chinese=60;
        s2.math=90;
        s2.getSum();
        s2.getAve();






    }

}
