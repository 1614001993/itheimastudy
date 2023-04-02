package com.myinterface;

public class Test1 {
    public static void main(String[] args) {
        zi zi = new zi();
        zi.method1();
        zi.method2();
        zi.method3  ();


    }
}

//定义一个接口，就是将原来的抽象类中的class abstract替换为interface即可
interface ifTest {
    public abstract void method1();

    public abstract void method2();

    public abstract void method3();

}

//使用类来实现接口
class shixian implements ifTest {
    public void method1() {
        System.out.println("吃饭");
    }

    public void method2() {
        System.out.println("喝酒");
    }

    public void method3() {
        System.out.println("打麻将");
    }
}

class zi extends shixian {

}

