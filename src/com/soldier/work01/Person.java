package com.soldier.work01;

/**
 * @Author soldier
 * @Date 2020/3/11 19:30
 * @Version 1.0
 * @Description:
 */
public class Person {

    // 学号pNo，姓名pName，性别pSex，年龄pAge
    private String pNo;
    private String pName;
    private String pSex;
    private int pAge;

    // 带参数的构造方法
    public Person(String pNo, String pName, String pSex, int pAge) {
        this.pNo = pNo;
        this.pName = pName;
        this.pSex = pSex;
        this.pAge = pAge;
    }

    // getNo（）获取学号，getName获取姓名，getSex获取性别，getAge（）获取年龄
    public String getpNo() {
        return pNo;
    }

    public void setpNo(String pNo) {
        this.pNo = pNo;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpSex() {
        return pSex;
    }

    public void setpSex(String pSex) {
        this.pSex = pSex;
    }

    public int getpAge() {
        return pAge;
    }

    public void setpAge(int pAge) {
        this.pAge = pAge;
    }
}
