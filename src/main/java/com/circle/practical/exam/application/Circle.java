package com.circle.practical.exam.application;

public class Circle {

    /**
     * Model for a circle
     *
     * @param pi  A constant value of pi
     * @param radius A any value of radius
     */

    private final double  pi = 3.14159;
    private double radius = 15.123;


    public void getCircumference() {
        double circumference = (2*pi*radius);

        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + circumference);
    }

    public double getArea() {
        double area = (pi * (radius * 2));

        System.out.println("Area: " + area);
        return area;
    }
}
