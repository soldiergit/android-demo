package com.soldier.work01;

/**
 * @Author soldier
 * @Date 2020/3/11 19:31
 * @Version 1.0
 * @Description: 类Person有一个子类学生类Student
 */
public class Student extends Person {

//    Android成绩
    private int sAnd;

    public Student(String pNo, String pName, String pSex, int pAge, int sAnd) {
        super(pNo, pName, pSex, pAge);
        this.sAnd = sAnd;
    }

    public int getsAnd() {
        return sAnd;
    }

    public void setsAnd(int sAnd) {
        this.sAnd = sAnd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sAnd=" + sAnd +
                "pNo=" + super.getpNo() +
                "pName=" + super.getpName() +
                "pSex=" + super.getpSex() +
                "pAge=" + super.getpAge() +
                '}';
    }
}
