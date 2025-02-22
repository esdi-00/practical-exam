package com.rocs.circle.application.model;

public class Circle {

    private double area;
    private double circumference;
    private double radius;
    private double diameter;
    private int a;
    private int b;
    private int PI;

    public Circle() {

    }

    public Circle(double area, double circumference, double radius, double diameter) {
        this.area = area;
        this.circumference = circumference;
        this.radius = radius;
        this.diameter = diameter;
    }

    public double getArea() {
        return Math.sqrt(2) ;
    }
//2 * (radius + diameter)
    public double getCircumference() {
        return 2 * Math.sqrt(2);
    }
    //2 * (a + b)
}
