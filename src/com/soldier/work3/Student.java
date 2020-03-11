package com.soldier.work3;

/**
 * @Author soldier
 * @Date 2020/3/11 20:15
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 */
public class Student {
    // 学号sNo、姓名sName、性别sSex、班级sClass、出生年月sbirthday
    private int sNo;
    private String sName;
    private int sSex;
    private String sClass;
    private String sbirthday;

    public Student() {
        super();
    }

    public Student(int sNo, String sName, int sSex, String sClass, String sbirthday) {
        this.sNo = sNo;
        this.sName = sName;
        this.sSex = sSex;
        this.sClass = sClass;
        this.sbirthday = sbirthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sNo=" + sNo +
                ", sName='" + sName + '\'' +
                ", sSex=" + sSex +
                ", sClass='" + sClass + '\'' +
                ", sbirthday='" + sbirthday + '\'' +
                '}';
    }

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsSex() {
        return sSex;
    }

    public void setsSex(int sSex) {
        this.sSex = sSex;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    public String getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        this.sbirthday = sbirthday;
    }
}
