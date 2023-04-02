package com.demo1;

public class Teacher {
    private String name;
    private int age;
    private String  hobby;
    private String addr;

    public Teacher() {
    }

    public Teacher(String name, int age, String hobby, String addr) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.addr = addr;
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * 设置
     * @param hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /**
     * 获取
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 设置
     * @param addr
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

}
