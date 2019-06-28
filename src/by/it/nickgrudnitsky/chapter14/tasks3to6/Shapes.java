package by.it.nickgrudnitsky.chapter14.tasks3to6;

import java.util.Arrays;
import java.util.List;

abstract class Shape {

    abstract public void highlightOnOff();

    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    private boolean highlighted = false;

    public void highlightOnOff() {
        highlighted = (!highlighted);
    }

    public String toString() {
        return "Circle is " + (highlighted ? "On" : "Off");
    }
}

class Square extends Shape {
    private boolean highlighted = false;

    public void highlightOnOff() {
        highlighted = (!highlighted);
    }

    public String toString() {
        return "Square is " + (highlighted ? "On" : "Off");
    }
}

class Triangle extends Shape {
    private boolean highlighted = false;

    public void highlightOnOff() {
        highlighted = (!highlighted);
    }

    public String toString() {
        return "Triangle is " + (highlighted ? "On" : "Off");
    }
}

class Rhomboid extends Shape {
    private boolean highlighted = false;

    public void highlightOnOff() {
        highlighted = (!highlighted);
    }

    public String toString() {
        return "Rhomboid is " + (highlighted ? "On" : "Off");
    }
}

public class Shapes {
    static void rotate(Shape shape) {
        if (shape instanceof Circle) {
            return;
        }
        System.out.println("rotate");
    }

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        for (Shape shape : shapeList)
            shape.draw();

        Rhomboid rhomboid = new Rhomboid();
        Shape shape = rhomboid;
        if (shape instanceof Circle) {
            shape.draw();
            shape.highlightOnOff();
        }
    }
}