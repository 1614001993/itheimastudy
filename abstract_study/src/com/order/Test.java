package com.order;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        OrderService order = null;
        switch (n) {
            case 1:
                order = new OrderServiceImp();
                break;
            case 2:
                order = new OrderServiceOverseas();
                break;
        }
        order.cancel();
        order.payOrder();
        order.create();
        order.find();
        order.findList();
        order.finish();
    }
}
