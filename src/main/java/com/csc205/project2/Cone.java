package com.csc205.project2;

public class Cone extends Shape {

        private double height;

        public Cone(double radius, double height) {
            super(radius);
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getSlantHeight() {
            return Math.sqrt(Math.pow(size, 2) + Math.pow(height, 2));
        }

        @Override
        public double surfaceArea() {
            return Math.PI * size * (size + getSlantHeight());
        }

        @Override
        public double volume() {
            return (1.0/3.0) * Math.PI * Math.pow(size, 2) * height;
        }
    }

