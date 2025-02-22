package com.rocs.practical.exam.application;




import com.rocs.practical.exam.application.model.circle.Circle;

import java.util.Scanner;

public class PracticalExam {


    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);



        System.out.println("Enter a radius to get Circle and Ellipse : ");

       double choice =  scanner.nextInt();

        Circle circle = new Circle(choice);
        System.out.println(" Solved : " + circle);



    }
}
