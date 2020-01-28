package com.company;

import static com.company.ShapeType.SQUARE;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape(ShapeType.CIRCLE);
        shape.draw();

        shape = shapeFactory.getShape(ShapeType.RECTANGLE);
        shape.draw();

        shape = shapeFactory.getShape(SQUARE);
        shape.draw();
    }
}
