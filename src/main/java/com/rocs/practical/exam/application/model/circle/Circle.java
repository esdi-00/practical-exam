package com.rocs.practical.exam.application.model.circle;

public class Circle {


    private double area;
    private double circumference;

    private double diameter;
    private double radius;



    private final double PI =  3.14159265359;


    public Circle(double radius) {
        this.area = getArea();
        this.circumference = getCircumference();
        this.diameter = getDiameter();

    }

    public double getArea() {
        return  PI * Math.sqrt(radius * 2)  ;
    }

    public double getCircumference() {
        return 2 * PI / (( Math.sqrt(area * 2 + radius * 2 ) /2));
    }

    public double getDiameter(){
        return 2 * radius;
    }

}
