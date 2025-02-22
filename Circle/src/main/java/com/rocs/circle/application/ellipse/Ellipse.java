package com.rocs.circle.application.ellipse;

public class Ellipse {

    protected double radius;

    public Ellipse (double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * minorAxis ;
    }

    public  double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public double getRadius(){
        return Math.E * radius;
    }

    private double minorAxis;

    public  Ellipse (double majorAxis, double minorAxis){
        super();
        this.minorAxis = minorAxis;
    }
    public double getPerimeter(){
        return Math.PI * minorAxis - Math.sqrt((3 * radius + minorAxis) * (radius + 3 * minorAxis));
    }

}
