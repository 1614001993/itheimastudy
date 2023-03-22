package com.moopstudy;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {



        /*
	分析以下需求并完成代码
        共有6个评委给1名选手打分, 分数为键盘录入的[1-100]之间的整数
        对录入的分数进行判断, 超出范围则给出错误提示, 并重新录入
        将分数存储到合适的数组中
        去掉一个最高分去掉一个最低分, 计算该选手的平均分并在控制台打印
*/
        double[] score=new double[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.println("请第"+(i+1)+"个评委打分");
            score[i]=scanner.nextDouble();
            if(score[i]>100||score[i]<0){
                System.out.println("请正确打分");
                i--;
                continue;
            }
        }
        double sum=0;
        double max=score[0];
        double min=score[0];
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
            if(score[i]>max){
                max=score[i];
            }
            if(score[i]<min){
                min=score[i];
            }
            sum+=score[i];
        }
        double ave=(sum-max-min)/(score.length-2);
        System.out.println(ave);
    }
}
