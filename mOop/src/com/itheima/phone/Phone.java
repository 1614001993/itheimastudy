package com.itheima.phone;

public class Phone {
    String  bridge;
    int price;
    double size;
    public static void printPhone(String bridge,int price,double size){
        System.out.println(bridge);
        System.out.println(price);
        System.out.println(size);
    }
    public  void call(){
        System.out.println("打电话");

    }
    public  void sendMessage(){
        System.out.println("发短信");
    }
}
