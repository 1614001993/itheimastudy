package com.itheima.forwhile;

public class WhileDemo {
    //打印1~100
    public static void main(String[] args) {
        int i=1;
        while(i<=100){
            System.out.println(i);
            i++;
        }
        System.out.println("+++++++++++++++++++");
        int n=1;
        do{
            System.out.println(n);
            n++;
        }while(n<=100);

    //    求0~100的偶数和
        int number=0;
        int sum1=0;
        while(number<=100){
            sum1+=number;
            number+=2;
        }
        System.out.println("1~100的偶数和为"+sum1);
    }


}
