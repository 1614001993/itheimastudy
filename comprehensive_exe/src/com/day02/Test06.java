package com.day02;

import java.util.Scanner;

/*06、分析并完成以下需求:

        1.提示用户录入一个字符串，要求字符串中必须存在字母（定义方法）
        2.不符合要求：提示录入有误！重新录入
        3.符合要求：判断字符串中大写字母出现次数并打印（定义方法）*/
public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入字符串（必须包含字母）");

        while (true) {
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            Boolean has = hasZiMu(arr);
            if(has){
                int count =getCount(arr);
                System.out.println("大写字母的个数为"+count);
                break;
            }
            System.out.println("没有包含字母，请重新输入");
        }
    }

    public static Boolean hasZiMu(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z')) {
return true;
            }
        }
        return false;
    }
    public static int getCount(char[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 'A' && arr[i] <= 'Z'){
                count++;
            }
        }
        return count;



    }
}
