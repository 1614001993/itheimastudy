package com.itheima.constructor;

import com.itheima.constructor.Student;

public class StudentTest {
    public static void main(String[] args) {

        //调用无参构造器
        Student s1 = new Student();
        s1.name="张三";
        s1.hobby="打篮球";
        System.out.println(s1.name+s1.hobby);

        //调用有参构造器
        Student s2 = new Student("李四","唱歌");
        System.out.println(s2.name+s2.hobby);
    }
}
