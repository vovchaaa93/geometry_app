package com.geometry;

import com.geometry.shapes.Circle;
import com.geometry.shapes.Rectangle;
import com.geometry.shapes.Shape;
import com.geometry.shapes.Triangle;
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

    }
}
