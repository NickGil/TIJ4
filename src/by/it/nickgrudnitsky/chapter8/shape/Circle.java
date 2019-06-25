//: polymorphism/shape/Circle.java
package by.it.nickgrudnitsky.chapter8.shape;


public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void print() {
        System.out.println("I'm circle.");
    }
} ///:~
