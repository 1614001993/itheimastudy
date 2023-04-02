package com.this_super;

public class superTest {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.print();
    }

}

class Fu {
    public int a=10;
    public void show() {
        System.out.println("父类方法");
    }
}
class Zi extends Fu{
    int a=20;
    int b=this.a;
    public void print(){
        System.out.println(a);
        System.out.println(b);
        show();

    }}
