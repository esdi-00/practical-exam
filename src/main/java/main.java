import java.util.Scanner;
i
        public class Main {
            public static void main(String[] args) {
                Circle circle = new Circle(5.0);
                System.out.println(circle);
                System.out.println("Circumference: " + circle.getCircumference());
                System.out.println("Area: " + circle.getArea());

                circle.setRadius(10.0);
                System.out.println("Updated Circle: " + circle);
            }
        }


