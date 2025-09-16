package com.geometry;

import com.geometry.shapes.Circle;
import com.geometry.shapes.Rectangle;
import com.geometry.shapes.Shape;
import com.geometry.shapes.Triangle;

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
    }
}
