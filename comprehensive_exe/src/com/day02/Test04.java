package com.day02;

import java.util.Scanner;

import static java.util.Arrays.sort;

/*04、分析并完成以下需求:
        录入字符串：sc.next();
        将字符串转为字符数组：cahr[] arr = str.toCharArray();
        字母字符、数字字符在码表中是连续出现的，a-z：97-113
        1.提示用户键盘录入一个包含数字和字母的字符串（不用做是否包含数字和字母的判断）
        2.遍历字符串，分别筛选出数字和字母，按照数字在前字母在后的规则，组成一个新的字符串，并打印*/
public class Test04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个包含数字字母的字符串：");
        String str=sc.next();

        char[] arr=str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        char[] arr1=sort(arr);
        String newStr="";
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
            newStr+=arr1[i];
        }
        System.out.println(newStr);
    }

    private static char[] sort(char[] arr) {
        char[] arr1=new char[arr.length];
        int start=0;
        int end=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>='0'&&arr[i]<='9'){
                arr1[start]=arr[i];
                start++;
            }
            if(arr[i]>='a'&&arr[i]<='z'){
                arr1[end]=arr[i];
                end--;
            }
        }
        return arr1;

    }
}
