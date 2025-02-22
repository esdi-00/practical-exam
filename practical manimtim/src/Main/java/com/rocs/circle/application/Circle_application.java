package com.rocs.circle.application;

import java.util.Scanner;
public class Circle_application {

        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            double degrees = 0;

            System.out.println("Enter degrees of the circle: ");
            degrees = sc.nextDouble();

            circle mycircle = new circle(degrees);

            System.out.printf("Circle Circumference " + mycircle.getCircumference());
            System.out.printf("Circle area " + mycircle.getArea());
            System.out.printf("Circle area " + mycircle.getElipsearea());

        }



    }
