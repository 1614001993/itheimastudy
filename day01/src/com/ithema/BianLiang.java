package com.ithema;

public class BianLiang {
    public static void main(String[] args) {
//比如：你现在有188.8元，一会要发100元，再收20元。
        double price = 188.8;
        price = price - 100;
        price = price + 20;
        System.out.println("剩余的钱数为" + price);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
//再比如：公交车大人2元，小孩一元，公交车经过2站
//第一站：3个大人1个小孩上车
//第二站：1个大人1个小孩上车，请问一共上了多少人，一共收入多少钱？
//刚开始公交车箱子里没有钱，用money2表示箱子里的钱
        int people = 0;
        int money = 0;
        people = people + 3 + 1;
        people = people + 1 + 1;
        money = money + 3 * 2 + 2 * 1;
        money = money + 1 * 2 + 1 * 1;
        System.out.println("公交车总人数为" + people + ",公交车总钱数为" + money);


    }
}
