package com.moopstudy.peopledemo;

public class PeopleTest {
    public static void main(String[] args) {
        People pe1 = new People("玄德", 39);
        People pe2 = new People("云长", 35);
        People pe3 = new People("翼德", 34);
        People[] arr = {pe1, pe2, pe3};
        People pe = new People();
        int minAge=pe.getMinAge(arr);
        System.out.println(minAge);
        double aveAge=pe.getAvgAge(arr);
        System.out.println(aveAge);
    }
}
class People {
    private String name;
    private int age;
    public int getMinAge(People[] arr) {
        int tmp = arr[0].getAge();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() < tmp) {
                tmp = arr[i].getAge();
            }
        }
        return tmp;
    }
    public double getAvgAge(People[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i].getAge();
        }
        return sum/arr.length;
    }
    public People() {
    }
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
