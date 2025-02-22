package com.circle.practical.exam.application;

import java.util.Scanner;

public class CircleApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice: ");
        System.out.println("1. Circle ");
        System.out.println("2. Ellipse ");
        int choice = sc.nextInt();

        switch (choice){
            case 1: {
                System.out.println("Circle");
                Circle circle = new Circle();

                circle.getArea();

                circle.getCircumference();
                break;
            }
            case 2: {
                System.out.println("\n" + "Ellipse");
                Ellipse ellipse = new Ellipse();

                ellipse.getArea();
                ellipse.getCircumference();
                break;
            }
        }


    }
}
