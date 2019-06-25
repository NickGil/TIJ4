//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package by.it.nickgrudnitsky.chapter11.shape;

import java.util.Iterator;
import java.util.Random;

public class RandomShapeGenerator implements Iterable<Shape>{
  private Random rand = new Random();

  private int count;

  public RandomShapeGenerator(int count) {
    this.count = count;
  }

  @Override
  public Iterator<Shape> iterator() {
    return new Iterator<Shape>() {

      private int index = 0;

      @Override
      public boolean hasNext() {
        return index++ < count;
      }

      @Override
      public Shape next() {
        switch(rand.nextInt(3)) {
          default:
          case 0: return new Circle();
          case 1: return new Square();
          case 2: return new Triangle();
        }
      }
    };
  }
}
