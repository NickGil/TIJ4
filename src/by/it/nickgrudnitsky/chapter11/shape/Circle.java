//: polymorphism/shape/Circle.java
package by.it.nickgrudnitsky.chapter11.shape;
import static by.it.nickgrudnitsky.myLibrary.Print.print;


public class Circle extends Shape {
  public void draw() { print("Circle.draw()"); }
  public void erase() { print("Circle.erase()"); }
} ///:~
