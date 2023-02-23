package com.csc205.project2;

public class Cube extends Shape {

    public Cube(double side) {
        super(side);
    }

    public double surfaceArea() {
        return 6 * Math.pow(size, 2);
    }

    public double volume() {
        return Math.pow(size, 3);
    }

    @Override
    public String toString() {
        return "Cube {side length=" + size + ", surface area=" + surfaceArea() + ", volume=" + volume() + "}";
    }
}