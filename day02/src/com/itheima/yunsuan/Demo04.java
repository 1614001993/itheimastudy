package com.itheima.yunsuan;

public class Demo04 {
    public static void main(String[] args) {
        int num = 3;
        char ch = 'a';               //'a'=97
        num += ch;                  //num=num+97
        System.out.println(num);     //num=100
        String str = "100";
        str += num;  // str=str+100          100100
        System.out.println(str);           //100100
        num += 10.8;      //num=(double)(num+10.8)
        System.out.println(num);              //110
        double num1 = 10.1;
        num1 -= num;   //num1=num1-num       10.1-110=-99.9
        System.out.println(num1);       //-99.9

    }
}
