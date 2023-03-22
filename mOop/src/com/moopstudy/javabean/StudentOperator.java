package com.moopstudy.javabean;

public class StudentOperator {
    private Student s1;
    public StudentOperator() {
    }
    public StudentOperator(Student s1) {
        this.s1=s1;
    }
    //判断成绩是否合格
    public void ifScore(){
        if(s1.getScore()>60){
            System.out.println("成绩合格");
        }else{
            System.out.println("成绩不合格");
        }
    }
}
