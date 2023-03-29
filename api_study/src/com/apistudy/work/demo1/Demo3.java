package com.apistudy.work.demo1;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String n = sc.next();
        Demo1(n);
    }

    /*
	分析以下需求并完成代码
        提示键盘录入一个包含数字和字母的字符串
        遍历字符串, 按照数字在前字母在后的规则, 组成一个新的字符串并打印
*/
    public static void Demo1(String n) {
        char[] arr = n.toCharArray();
        char[] newArr = new char[n.length()];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        int t=0;
        int j=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if ('0' <= arr[i] && arr[i] <= '9') {
                newArr[t] = arr[i];
                t++;
            } else {
                newArr[j] = arr[i];
                j--;
            }
        }
        String str = "";
        for (int i = 0; i < newArr.length; i++) {
            str += newArr[i];
        }
        System.out.println(str);
    }
}
