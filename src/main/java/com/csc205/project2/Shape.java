package com.csc205.project2;

public abstract class Shape implements ThreeDimensionalShape {

    protected double size;

    public Shape(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public abstract double surfaceArea();

    @Override
    public abstract double volume();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName()).append(" {");
        sb.append("size=").append(size);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
