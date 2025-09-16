package com.geometry;

import com.geometry.shapes.Circle;
import com.geometry.shapes.Rectangle;
import com.geometry.shapes.Shape;
import com.geometry.shapes.Triangle;
import com.geometry.shapes.threeD.Cube;
import com.geometry.shapes.threeD.Shape3D;
import com.geometry.shapes.threeD.Sphere;
import com.geometry.utils.GeometryUtils;

import java.util.ArrayList;
import java.util.List;

public class GeometryApp {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle(10));
        shapeList.add(new Rectangle(2,5));
        shapeList.add(new Triangle(4,3,5));

        for (Shape shape : shapeList) {
            System.out.println(shape.getInfo());
        }

        System.out.println(GeometryUtils.cmToMeters(125));
        System.out.println(GeometryUtils.compareAreas(shapeList.get(0), shapeList.get(1)));
        System.out.println(GeometryUtils.getLargestShape(shapeList.get(1), shapeList.get(2)));

        List<Shape3D> shape3DList = new ArrayList<>();
        shape3DList.add(new Cube(2));
        shape3DList.add(new Sphere(5));

        for (Shape3D shape3D : shape3DList) {
            System.out.println(shape3D.getInfo());
        }
    }
}
