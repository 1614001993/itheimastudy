package com.moopstudy.javabean;

public class Student {
//    所有的成员变量都必须私有
//    手动提供一个无参构造器
    private String name;
    private double score;
    public Student() {
    }
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
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
     * @return score
     */
    public double getScore() {
        return score;
    }

    /**
     * 设置
     * @param score
     */
    public void setScore(double score) {
        this.score = score;
    }

    public String toString() {
        return "Student{name = " + name + ", score = " + score + "}";
    }
}
