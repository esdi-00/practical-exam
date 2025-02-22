package com.circle.practical.exam.application;

public class Ellipse extends Circle{

    /**
     * Model for a Ellipse
     *
     * @param area  A constant value of area
     * @param a The major axis length
     * @param b The minor axis length
     */

    private final double area = 3.142;
    private double a = 10;
    private double b = 5;

    @Override
    public double getArea() {
        return area * a * b;
    }

    @Override
    public void getCircumference() {
        double perimeter;

        perimeter = (double)2 * area * Math.sqrt((a * a + b * b) / (2 * 1.0)) ;
        System.out.println("Perimeter: " + perimeter);
    }

}
