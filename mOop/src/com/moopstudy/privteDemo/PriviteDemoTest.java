package com.moopstudy.privteDemo;

public class PriviteDemoTest {
    public static void main(String[] args) {
        PrivteDemo pr = new PrivteDemo();
        pr.brand="大众";
        pr.setName("v8发动机");;
        //被私有化
        // pr.price=666.00;
        pr.setPrice(899);
        System.out.println(pr.getPrice());
        System.out.println(pr.getName());
        pr.info();

    }
}
