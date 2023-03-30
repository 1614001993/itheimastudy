package com.test01;

/*

题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
        程序分析：利用while语句,条件为输入的字符不为'\n'.
*/

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        Demo1(n);
    }

    public static void Demo1(String n) {
        System.out.println(n.length());
        char[] arr = new char[n.length()];
        //将字符串拆分为字符数组
        //数字
        int count = 0;
        //字母
        int count1 = 0;
        //空格
        int count2 = 0;
        //其他字符
        int coun3 = 0;
        for (int i = 0; i < n.length(); i++) {
            arr[i] = n.charAt(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] == 32) {
                count2++;
            }
            if ((arr[i] > 'a' && arr[i] < 'z') || (arr[i] > 'A' && arr[i] < 'Z')) {
                count1++;

            }
        }
        System.out.println(count2);

    }
}
