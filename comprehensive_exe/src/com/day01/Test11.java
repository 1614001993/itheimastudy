package com.day01;

import java.util.Scanner;

/*11、分析并完成以下需求:

        1.控制台提示并键盘录入，总共6个评委给1名选手打分，分数为[1-100]之间的int类型整数
        2.对录入分数进行判断，超出范围给出提示，重新录入
        3.将分数存储到合适的数组中
        4.去除一个最高分、一个最低分，统计该选手的平均成绩，并在控制台打印*/
public class Test11 {
    public static void main(String[] args) {
        int[] stu = new int[6];
        Demo1(stu);
    }

    public static void Demo1(int[] stu) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < stu.length; i++) {
            System.out.println("请输入第" + (i+1) + "位学员的成绩：");
            while(true){
                int score = sc.nextInt();
                if (score > 0 && score <= 100) {
                    stu[i] = score;
                    break;
                }else{
                    System.out.println("您输入的成绩有误，请重新输入：");
                }
            }
        }
        int max=stu[0];
        int min=stu[0];
        int sum=0;
        for (int i = 1; i < stu.length; i++) {
            if(stu[i]>max){
                max=stu[i];
            }
            if(stu[i]<min){
                min=stu[i];
            }
            sum+=stu[i];
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        double ave=(sum-max-min)/(stu.length-2);
        System.out.println(ave);
    }
}
