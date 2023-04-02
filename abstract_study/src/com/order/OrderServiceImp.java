package com.order;

public class OrderServiceImp  implements OrderService{

    @Override
    public void create() {
        System.out.println("创建订单");
    }

    @Override
    public void find() {
        System.out.println("查找订单");
    }

    @Override
    public void findList() {
        System.out.println("获取订单列表");
    }

    @Override
    public void cancel() {
        System.out.println("取消订单");
    }

    @Override
    public void finish() {
        System.out.println("完成订单");
    }

    @Override
    public void payOrder() {
        System.out.println("支付订单");
    }
}
