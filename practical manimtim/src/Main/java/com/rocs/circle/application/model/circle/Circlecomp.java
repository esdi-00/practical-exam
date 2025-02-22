package com.rocs.circle.application.model.circle;

public class Circlecomp {
    private double degrees;
    private double circumference;
    private  double area;

    private double Elipsearea;

    private double pi;


    public Circlecomp(double degrees) {
        this.degrees = degrees;
        this.circumference = computecircumference();
        this.area = computearea();
        this.pi=3.14;
        this.Elipsearea = computeElipsearea();

    }


    public double getdegrees() {
        return degrees;
    }

    public double getCircumference() {
        return circumference;
    }

    private double getArea() {
        return area;
    }

    private double computeDegrees() {return degrees;}

    private double getElipsearea() {return Elipsearea;}

    private double computecircumference(){return 2 * pi *(Math.sqrt(degrees));}

    private double computearea(){return pi * (Math.sqrt(degrees));}

    private double computeElipsearea(){return pi * area * (Math.sqrt(degrees));}


}
