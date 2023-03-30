package com.day02;

import java.util.Scanner;

/*05、分析并完成以下需求:
        截取字符串方法：
        String newStr = str.subString(起始索引)；//默认到结束 136 8944 6894
        String newStr = str.subString(起始索引，结束索引-1)； 012 3456 7890
        1.提示用户输入手机号码
        2.电话号码必须为132、134、135开头，必须为11位
        3.通过代码逻辑进行修改，要求中间四位使用*代替
        示例：用户输入13279440986 控制台打印：132****0986  */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入手机号");
        String phoneNum=sc.next();
        String newPhoneNum="";
        String newBody="";
        String end="";
        String start=phoneNum.substring(0,3);
        if((start.equals("132")||start.equals("134")||start.equals("135"))&&phoneNum.length()==11){
            String body=phoneNum.substring(3,7);
            char[] re=body.toCharArray();

            for (int i = 0; i < re.length; i++) {
                re[i]='*';
                newBody+=re[i];

            }
            System.out.println(newBody);
            end=phoneNum.substring(7,11);
        }
        newPhoneNum+=start+newBody+end;
        System.out.println(newPhoneNum);
    }
}
