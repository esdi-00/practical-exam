package com.rocs.circle.application.model.circle;
public abstract class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public abstract double getCircumference();

        public abstract double getArea();
}


