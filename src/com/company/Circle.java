package com.company;

public class Circle {
    private static final double PI = 3.14;
    private static double radius;


    static public double  getCircumference() {
        double circumference = 2.0 * PI * radius;

        return 2.0 * PI * radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getDiameter() {
        return 2.0 * radius;
    }
    public double getArea() {
        return PI * radius * radius;
    }
}


