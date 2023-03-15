package com.itheima.forwhile;

public class ForDemo {
    public static void main(String[] args) {
        //打印1~100
        for(int i=0;i<=100;i++){
            System.out.println(i);
        }

    //    求1~100的奇数和
        int sum=0;
        for (int i = 1; i <=100 ; i++) {
            if(i%2==1){
                sum+=i;
            }
        }
        System.out.println(sum);

        int sum2=0;
        for (int i = 1; i <=100 ; i+=2) {
            sum2+=i;

        }
        System.out.println(sum2);
    }
}
