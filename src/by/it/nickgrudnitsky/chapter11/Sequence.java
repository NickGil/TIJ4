package by.it.nickgrudnitsky.chapter11;//: innerclasses/Sequence.java
// Holds a sequence of Objects.

import java.util.*;



public class Sequence {
    private static ArrayList<Object> c = new ArrayList<>();

    private void add(Object x) {
        c.add(x);
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Iterator<Object> iterator = c.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\n");
        }
    }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
