package circle.application.ellipse;

import circle.application.circle.Circle;

public class Ellipse extends Circle {

        private double minorAxis;

        public Ellipse(double majorAxis, double minorAxis) {
            super(majorAxis);
            this.minorAxis = minorAxis;
        }

        @Override
        public double getCircumference() {

            double a = getRadius();
            double b = minorAxis;
            return PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
        }

        @Override
        public double getArea() {
            return PI * getRadius() * minorAxis;
        }
    }
