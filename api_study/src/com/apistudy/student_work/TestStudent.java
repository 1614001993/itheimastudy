package com.apistudy.student_work;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        Student st0 = new Student("张二", 88, 99);
        Student st1 = new Student("李四", 85, 78);
        Student st2 = new Student("王麻子", 86, 50);
        ArrayList<Student> student = new ArrayList<>();
        student.add(st0);
        student.add(st1);
        student.add(st2);
        StudentOperator sO = new StudentOperator();
        ArrayList<Student> student1= new ArrayList<>(sO.getScore(student));
        show(student1);
    }
    public static void show(ArrayList<Student> student1) {

        for (int i = 0; i < student1.size(); i++) {
            System.out.println("姓名:"+student1.get(i).getName()+" english:"+student1.get(i).getEnglish()+" chinese:"+student1.get(i).getChinese());
        }
    }
}
