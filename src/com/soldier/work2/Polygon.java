package com.soldier.work2;

/**
 * @Author soldier
 * @Date 2020/3/11 19:58
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description: 多边形
 * 要求：现实世界中有很多形状，如：多边形、长方形、正方形、梯形、三角形、平行四边形等。
 * 1、请以多边形做为父类，利用面向抽象编程完成编码。
 * 2、编写测试程序实现长方形、三角形的面积计算。
 */
public class Polygon {

    // 面积
    private int area;

    public Polygon(int area) {
        this.area = area;
    }
}
