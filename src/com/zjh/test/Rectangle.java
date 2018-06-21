package com.zjh.test;

/**
 * Created by jiazhao on 5/22/18.
 */
public class Rectangle implements Shape {

    private float side;
    private float length;
    public Rectangle(float side, float length) {
        this.side = side;
        this.length = length;
    }

    @Override
    public float getArea() {
        return 0;
    }

    @Override
    public float getPerimeter() {
        return 0;
    }
}
