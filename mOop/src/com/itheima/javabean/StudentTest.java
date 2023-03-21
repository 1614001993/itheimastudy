package com.itheima.javabean;

import com.itheima.javabean.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("李四");
        st.setScore(99.9);
        System.out.println(st.getScore()+st.getName());
        StudentOperator SO = new StudentOperator(st);
        SO.ifScore();
    }
}
