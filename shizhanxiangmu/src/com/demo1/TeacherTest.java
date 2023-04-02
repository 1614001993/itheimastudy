package com.demo1;

import java.util.ArrayList;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher th1 = new Teacher("张三", 29, "吸烟", "北京");
        Teacher th2 = new Teacher("李四", 39, "喝酒", "天津");
        Teacher th3 = new Teacher("王五", 29, "烫头", "河南");
        ArrayList<Teacher> ths = new ArrayList<>();
        ths.add(th1);
        ths.add(th2);
        ths.add(th3);
        for (int i = 0; i < ths.size(); i++) {
            Teacher tt=ths.get(i);
            System.out.print(tt.getName()+tt.getAge()+tt.getHobby()+tt.getAddr());
            System.out.println();

        }


    }
}
