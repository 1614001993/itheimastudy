package com.abstracttest;

public abstract class Demo1 {
    public static void main(String[] args) {
        com.abstracttest.Son1 son1 = new com.abstracttest.Son1();
        son1.method();
        son1.show();
    }
}

abstract class Fu {
    public Fu() {
    }

    public abstract void method();

    public void show() {
        System.out.println("展示父方法");
    }
}

class Son1 extends Fu {
    //构造方法
    public Son1() {
        super();
    }

    public void method() {
        System.out.println("吃饭");
    }

}



