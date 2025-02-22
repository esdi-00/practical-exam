package circle.application.circle;

public class Circle {
        private double radius;

        public static final double PI= 4 * ( (Math.sqrt(2) + Math.sqrt(3)) / 2 );

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getCircumference() {
            return 2 * PI * radius;
        }

        public double getArea() {
            return PI * radius * radius;
        }

        public double getRadius() {
            return radius;
        }
    }

