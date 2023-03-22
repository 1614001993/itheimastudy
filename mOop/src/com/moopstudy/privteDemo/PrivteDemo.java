package com.moopstudy.privteDemo;

public class PrivteDemo {
    String brand;
    private double price;
    private String name;


    //修改获取价格
    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("您输入的价格有误");

        } else {
            System.out.println("价格合理，修改成功");
            this.price = price;
        }
    }
    public double getPrice(){
        return price;
    }

    //修改获取发动机名称
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name=name;
    }
    public void info(){
        System.out.println(brand+"的发动机为"+name+",价格为"+price);
    }
}
