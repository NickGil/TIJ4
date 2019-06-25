package by.it.nickgrudnitsky.chapter11;//: holding/SimpleCollection.java

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SimpleCollection {
  public static void main(String[] args) {
    Set<Integer> c = new HashSet<>();
    for(int i = 0; i < 10; i++)
      c.add(i); // Autoboxing
    for(Integer i : c)
      System.out.print(i + ", ");
  }
} /* Output:
0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
*///:~
