package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

public class Project2 {

    public static void main(String[] args) {

        Sphere sphere = new Sphere(2.0);
        Cube cube = new Cube(5.0);
        Cylinder cylinder = new Cylinder(4.0, 1.0);
        Cone cone = new Cone(3.0, 4.0);

        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(cone);

        for (ThreeDimensionalShape shape : shapes) {
            System.out.println(shape.toString());
        }
    }

}


