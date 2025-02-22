package com.rocs.circle.application.app;

public class Circle {
    private double radius;

    public static final  double PI = 4*((Math.sqrt(2)+Math.sqrt(3))/2);
    public Circle (double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius ;
    }

    public  double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public double getRadius(){
     return  radius;
    }


}
