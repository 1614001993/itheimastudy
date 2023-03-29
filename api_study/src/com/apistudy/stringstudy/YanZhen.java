package com.apistudy.stringstudy;

import java.util.Random;
import java.util.Scanner;

public class YanZhen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入验证码的位数");
        int n = sc.nextInt();
        randomCode(n);
    }
    //    随机生成验证码
    public static void randomCode(int n) {
        String zifu = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        String yanzheng = "";
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            int r = rd.nextInt(zifu.length());
            char c = zifu.charAt(r);
            yanzheng += c;
        }
        System.out.println(yanzheng);
    }
}
