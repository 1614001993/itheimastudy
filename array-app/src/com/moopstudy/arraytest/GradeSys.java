package com.moopstudy.arraytest;

import java.util.Scanner;

public class GradeSys {

    public static void main(String[] args) {
        double averageScore = scoreArr(6);
        System.out.println(averageScore);
    }


    public static double scoreArr(int people) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double  average;
        double[] score = new double[people];
        for (int i = 0; i < score.length; i++) {
            System.out.print("请第"+(i+1)+"个评委打分：");
            score[i] = sc.nextDouble();
            if (score[i]<0||score[i]>100){
                System.out.println("请打出正确的分数");
                i--;
                continue;
            }
            sum += score[i];
        }
        average=sum/people;
        return average;
    }
}
