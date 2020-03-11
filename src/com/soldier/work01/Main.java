package com.soldier.work01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author soldier
 * @Date 2020/3/11 19:32
 * @Version 1.0
 * @Description: 创建五个该类的对象，输出每个学生的信息，计算这五个学生Android成绩的平均值，以及计算并输出他们的Android成绩的最大值和最小值
 */
public class Main {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        for (int i = 1; i <= 5 ; i++) {
            Student student = new Student("学号"+i,"姓名"+i,"男",10+i, 20+i);
            studentList.add(student);
        }
        // 输出
        Iterator<Student> iterator = studentList.iterator();
        // Android的平均成绩
        int androidSum = 0;
        // 最大值和最小值
        int max = studentList.get(0).getsAnd(), min = studentList.get(0).getsAnd();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            androidSum += student.getsAnd();
            if (student.getsAnd() > max) max = student.getsAnd();
            if (student.getsAnd() < min) min = student.getsAnd();
            System.out.println(student.toString());
        }
        System.out.println("Android的平均成绩 = "+androidSum / 5);
        System.out.println("Android成绩最大值 = "+max+",Android成绩最小值 = "+min);
    }
}
