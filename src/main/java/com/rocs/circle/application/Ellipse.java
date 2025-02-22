package com.rocs.circle.application;

public class Ellipse {

    private double area;
    private double perimeter;
    private double pi = 3.1416;
    private double radius;

    public Ellipse(double area, double perimeter, double pi, double radius) {
        this.area = computeArea();
        this.perimeter = computePerimeter();
        this.pi = pi;
        this.radius = radius;
    }

    public Ellipse() {
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double computeArea(){
        return pi * (radius * 2);
    }

    public double computePerimeter(){
        return 2 * pi * radius;
    }
}
