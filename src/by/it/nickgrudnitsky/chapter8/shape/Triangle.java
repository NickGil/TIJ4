//: polymorphism/shape/Triangle.java
package by.it.nickgrudnitsky.chapter8.shape;


public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    public void print() {
        System.out.println("I'm triangle.");
    }
} ///:~
