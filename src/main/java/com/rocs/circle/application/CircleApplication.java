package com.rocs.circle.application;

import java.util.Scanner;

public class CircleApplication {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radius = 0;

        System.out.println("Enter radius: ");
        radius = sc.nextDouble();

        Circle myCircle = new Circle();
        Ellipse myEllipse = new Ellipse();

        System.out.println("The circumference of the circle is " + myCircle.getCircumference());
        System.out.println("The area of the circle is " + myCircle.getArea());
        System.out.println("The perimeter of the circle is " + myEllipse.getPerimeter());
    }
}
