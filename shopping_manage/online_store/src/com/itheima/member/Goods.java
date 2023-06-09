package com.itheima.member;


public class Goods {


    private int id;//编号
    private String name;//商品名
    private double price;//商品价格
    private int stock;//商品库存


    public Goods() {
    }

    public Goods(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
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

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * 设置
     * @param stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }



}
