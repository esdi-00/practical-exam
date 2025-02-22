package com.rocs.circle.application;


import com.rocs.circle.application.app.Circle;
import com.rocs.circle.application.ellipse.Ellipse;

import java.util.Scanner;
public class CircleApplication {
    public static void main(String[] args) {

        Circle circle = new Circle(7);
        System.out.println("Circle Area" + circle.getCircumference());
        System.out.println("Circle Circumference" + circle.getArea());
        System.out.println("Circle Circumference" + circle.getRadius());


        Ellipse ellipse = new Ellipse(7,5);
        System.out.println("Circle Area" + ellipse.getCircumference());
        System.out.println("Circle Circumference" + ellipse.getArea());
        System.out.println("Circle Area" + ellipse.getPerimeter());


    }
}
