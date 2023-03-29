package com.apistudy.student_work;

import java.util.ArrayList;

public class StudentOperator {


    public ArrayList<Student> getScore(ArrayList<Student> list){
        ArrayList<Student> student=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            // System.out.println(list.get(i));
            if((list.get(i).getChinese()+list.get(i).getEnglish())<=170){
                student.add(list.get(i));
            }
        }
        return student;
    }
}
