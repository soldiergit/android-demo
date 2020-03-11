package com.soldier.work2;

/**
 * @Author soldier
 * @Date 2020/3/11 20:01
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description: 三角形
 */
public class Triangle extends Polygon {

    private int low;
    private int high;

    public Triangle(int low, int high) {
        super(low * high / 2);
        this.low = low;
        this.high = high;
    }
}
