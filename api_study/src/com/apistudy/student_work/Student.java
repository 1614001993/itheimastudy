package com.apistudy.student_work;

class Student {
    private String name;
    private int english;
    private int chinese;


    public Student() {
    }

    public Student(String name, int score, int chinese) {
        this.name = name;
        this.english = score;
        this.chinese = chinese;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return score
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     *
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    /**
     * 获取
     *
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     *
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public String toString() {
        return "Student{name = " + name + ", score = " + english + ", chinese = " + chinese + "}";
    }
}
