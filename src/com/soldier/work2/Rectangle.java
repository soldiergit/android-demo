package com.soldier.work2;

/**
 * @Author soldier
 * @Date 2020/3/11 20:01
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description: 长方形
 */
public class Rectangle extends Polygon {

    private int L;
    private int W;

    public Rectangle(int l, int w) {
        super(l * w);
        L = l;
        W = w;
    }
}
