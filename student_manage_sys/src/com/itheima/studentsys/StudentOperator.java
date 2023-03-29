package com.itheima.studentsys;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentOperator {
    ArrayList<Student> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void helloUser() {
        first();
        loop:
        while (true) {
            System.out.println("========欢迎使用学生管理系统========");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入您的选择");

            String n = sc.next();
            switch (n) {
                case "1":
                    addStu();
                    break;
                case "2":
                    delStu();
                    break;
                case "3":
                    chaStudent();
                    break;
                case "4":
                    showStu();
                    break;
                case "5":
                    System.out.println("退出系统");
                    break loop;
                default:
                    System.out.println("离开");
                    break;
            }

        }
    }

    //初始化学生信息
    private void first() {
        Student std = new Student("897987989", "jiji", 88, "南京");
        Student st1 = new Student("8979222989", "jij1i", 88, "被京");
        Student std2 = new Student("89798799089", "ji122ji", 68, "河南");
        list.add(std);
        list.add(st1);
        list.add(std2);
    }

    //添加学生信息
    private void addStu() {
        System.out.println("添加学生信息");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String n = sc.next();
        System.out.println("请输入学生年龄");
        int n1 = sc.nextInt();
        System.out.println("请输入学生住址");
        String n2 = sc.next();
        Random rd = new Random();
        int id = rd.nextInt(101);
        String ids = "xdclass";
        if (id < 10) {
            ids += "00" + id;
        } else if (id > 10 && id < 99) {
            ids += "0" + id;
        } else {
            ids += "0" + id;
        }
        Student stu = new Student(ids, n, n1, n2);
        list.add(stu);
        System.out.println("添加成功");
    }

    //根据id获取学生信息
    private Student getStuInfo(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return list.get(i);
            }
        }
        return null;
    }


    //删除学生信息
    private void delStu() {
        System.out.println("删除学生信息");

        if (list.size() == 0) {
            System.out.println("当前没有可删除的学生信息");
            return;
        } else {
            System.out.println("请输入您要删除的学生id");
            String id = sc.next();
            Student stus = getStuInfo(id);
            if (stus == null) {
                System.out.println("没有查询到学生信息");
                return;
            } else {
                list.remove(stus);
                System.out.println("删除成功");
            }
        }
    }

    //改变学生信息
    private void chaStudent() {
        System.out.println("改变学生信息");

    }

    //展示学生信息
    private void showStu() {
        System.out.println("展示学生信息");
        if (list.size() == 0) {
            System.out.println("当前没有学生信息，请添加后查看");
            return;
        } else {
            System.out.println("id\t\t\t\t姓名\t年龄\t住址");
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                System.out.println(stu.getId() + '\t' + stu.getName() + '\n' + stu.getAge() + '\n' + stu.getAddr());
            }
        }

    }


}
