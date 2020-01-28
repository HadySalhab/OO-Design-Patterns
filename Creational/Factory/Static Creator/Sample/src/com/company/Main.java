package com.company;

import static com.company.ShapeType.SQUARE;

public class Main {

    public static void main(String[] args) {


        Shape shape = ShapeFactory.getShape(ShapeType.CIRCLE);
        shape.draw();

        shape = ShapeFactory.getShape(ShapeType.RECTANGLE);
        shape.draw();

        shape = ShapeFactory.getShape(SQUARE);
        shape.draw();
    }
}
