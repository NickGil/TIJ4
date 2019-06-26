package by.it.nickgrudnitsky.chapter13;

import java.util.*;

public class Task2 {
    public String toString() {
        return " InfiniteRecursion address: " + super.toString() + "\n";
    }
    public static void main(String[] args) {
        List<Task2> v =
                new ArrayList<Task2>();
        for(int i = 0; i < 10; i++)
            v.add(new Task2());
        System.out.println(v);

    }
}
