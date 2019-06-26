//: polymorphism/shape/Square.java
package by.it.nickgrudnitsky.chapter11.shape;
import static by.it.nickgrudnitsky.myLibrary.Print.print;

public class Square extends Shape {
  public void draw() { print("Square.draw()"); }
  public void erase() { print("Square.erase()"); }
} ///:~
