package com.csc205.project2;

public class Sphere extends Shape {

    public Sphere(double radius) {
        super(radius);
    }

    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(size, 2);
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(size, 3);
    }

    @Override
    public String toString() {
        return "Sphere {radius=" + size + ", surface area=" + surfaceArea() + ", volume=" + volume() + "}";
    }
}