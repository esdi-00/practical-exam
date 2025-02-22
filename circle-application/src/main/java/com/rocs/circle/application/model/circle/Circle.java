package com.rocs.circle.application.model.circle;

public class Circle {
    private double pie;
    private double area;
    private double perimeter;
    private double cirumference;

    private double rad;

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public double getPie() {
        return 3.1416;
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

    public double getCirumference() {
        return cirumference;
    }

    public void setCirumference(double cirumference) {
        this.cirumference = cirumference;
    }
}
