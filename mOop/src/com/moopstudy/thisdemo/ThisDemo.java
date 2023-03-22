package com.moopstudy.thisdemo;

public class ThisDemo {
    int score;

    public void ifScore(int score) {
        if (this.score > score) {
            System.out.println("您的成绩合格");
        }else{
            System.out.println("您的成绩不合格");
        }
    }
}
