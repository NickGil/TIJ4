package by.it.nickgrudnitsky.chapter11;

import by.it.nickgrudnitsky.chapter11.shape.RandomShapeGenerator;
import by.it.nickgrudnitsky.chapter11.shape.Shape;

public class Task31 {
    public static void main(String[] args) {
        RandomShapeGenerator generator = new RandomShapeGenerator(5);
        for (Shape shape : generator) {
            System.out.println(shape);
        }
    }
}
