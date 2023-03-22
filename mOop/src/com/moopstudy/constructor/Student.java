package com.moopstudy.constructor;

public class Student {
    String name;
    String hobby;
    //无参构造器   如果自己没有创建有参构造器，系统会自动创建
    //无参构造器是一种特殊的方法,没有返回值,且方法名必须与类名相同
    public  Student(){
        System.out.println("无参构造器执行了");
    }
    public  Student(String name,String hobby){
        System.out.println("有参构造器执行了");

        this.name=name;
        this.hobby=hobby;
    }
}
