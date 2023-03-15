package com.itheima.phone;

public class TestPhone {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.call();
        phone.sendMessage();
        phone.bridge="小米";
        phone.price=3999;
        phone.size=6.2;
        System.out.println(phone.bridge+" "+phone.price+" "+phone.size);
    }
}
