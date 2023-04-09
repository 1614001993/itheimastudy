package com.itheima.member;

public class Order {
    private int orderId;//订单号
    private double money;//订单金额
    private String name;//名字

    public Order() {
    }

    public Order(int orderId, double money, String name) {
        this.orderId = orderId;
        this.money = money;
        this.name = name;
    }

    /**
     * 获取
     * @return orderId
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * 设置
     * @param orderId
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取
     * @return money
     */
    public double getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Order{orderId = " + orderId + ", money = " + money + ", name = " + name + "}";
    }
}
