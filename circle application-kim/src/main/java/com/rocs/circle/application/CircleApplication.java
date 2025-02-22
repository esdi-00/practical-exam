package com.rocs.circle.application;
import java.util.Scanner;

import com.rocs.circle.application.model.Circle;

public class CircleApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter to Compute Area");
        System.out.println("Enter Radius: ");
        double radius = sc.nextDouble();
        System.out.println("Enter Breadth: ");
        double breadth = sc.nextDouble();

        System.out.println("Enter to Compute Circumference");
        System.out.println("Enter A: ");
        double a = sc.nextDouble();
        System.out.println("Enter B: ");
        double b = sc.nextDouble();

        Circle myCircle = new Circle();

        System.out.println("The Area a Circle is " + myCircle.getArea());
        System.out.println("The Parameter/Circumference of a Circle is " + myCircle.getCircumference());
    }
}
