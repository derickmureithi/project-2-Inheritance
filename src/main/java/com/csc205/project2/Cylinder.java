package com.csc205.project2;

public class Cylinder extends Shape{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * size * height + 2 * Math.PI * Math.pow(size, 2);
    }

    public double volume() {
        return Math.PI * Math.pow(size, 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder {radius=" + size + ", height=" + height + ", surface area=" + surfaceArea() + ", volume=" + volume() + "}";
    }

}
