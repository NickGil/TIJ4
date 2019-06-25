package by.it.nickgrudnitsky.chapter8;//: polymorphism/Shapes.java
// Polymorphism in Java.


import by.it.nickgrudnitsky.chapter8.shape.RandomShapeGenerator;
import by.it.nickgrudnitsky.chapter8.shape.Rectangle;
import by.it.nickgrudnitsky.chapter8.shape.Shape;

public class Task2to4 {
  private static RandomShapeGenerator gen =
    new RandomShapeGenerator();
  public static void main(String[] args) {
    Shape[] s = new Shape[9];
    // Fill up the array with shapes:
    for(int i = 0; i < s.length; i++)
      s[i] = gen.next();
    // Make polymorphic method calls:
    for(Shape shp : s){
      //shp.draw();
      //shp.erase();
      shp.print();
    }

    Shape shape = new Rectangle();
    shape.print();
  }
} /* Output:
Triangle.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Circle.draw()
*///:~
