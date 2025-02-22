package circle.application;

import circle.application.circle.Circle;
import circle.application.ellipse.Ellipse;

public class CircleApplication {

        public static void main(String[] args) {

                Circle circle = new Circle(5);
                System.out.println("Circle Circumference: " + circle.getCircumference());
                System.out.println("Circle Area: " + circle.getArea());

                Ellipse ellipse = new Ellipse(6, 4);
                System.out.println("Ellipse Circumference: " + ellipse.getCircumference());
                System.out.println("Ellipse Area: " + ellipse.getArea());
        }
}
