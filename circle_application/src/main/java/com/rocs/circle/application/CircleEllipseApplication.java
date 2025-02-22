package com.rocs.circle.application;

import com.rocs.circle.application.model.circle.Circle;
import com.rocs.circle.application.model.circle.Ellipse;


public class CircleEllipseApplication {
    public static void main(String[] args) {
        Circle circle = new Circle(15) {
            @Override
            public double getCircumference() {
                return 2 * Math.sqrt(getRadius()) * 2;
            }

            @Override
            public double getArea() {
                return Math.sqrt(getRadius()) * Math.sqrt(Math.PI);
            }
        };

        System.out.println("Circle:");
        System.out.println("Circumference: " + circle.getCircumference());
        System.out.println("Area: " + circle.getArea());

        Ellipse ellipse = new Ellipse(5, 3);
        System.out.println("\nEllipse:");
        System.out.println("Circumference: " + ellipse.getCircumference());
        System.out.println("Area: " + ellipse.getArea());
    }
}
