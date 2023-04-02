package com.order;

public class OrderServiceOverseas implements OrderService {
    @Override
    public void create() {
        System.out.println("海外————————创建订单");
    }

    @Override
    public void find() {
        System.out.println("海外————————查找订单");
    }

    @Override
    public void findList() {
        System.out.println("海外————————获取订单列表");
    }

    @Override
    public void cancel() {
        System.out.println("海外————————取消订单");
    }

    @Override
    public void finish() {
        System.out.println("海外————————完成订单");
    }

    @Override
    public void payOrder() {
        System.out.println("海外————————支付订单");
    }
}
