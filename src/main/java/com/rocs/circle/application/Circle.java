package com.rocs.circle.application;

public class Circle{
    private double circumference;
    private double area;
    private double pi = 3.1416;
    private double radius;

    public Circle(double circumference, double area, double pi, double radius) {
        this.circumference = computeCircumference();
        this.area = computeArea();
        this.pi = pi;
        this.radius = radius;
    }

    public Circle() {
    }

    public double getCircumference() {
        return this.circumference;
    }

    public void setCircumference(int circumference) {
        this.circumference = circumference;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double computeArea(){
        return pi * (radius * 2);
    }

    public double computeCircumference(){
        return 2 * pi * radius;
    }
}
