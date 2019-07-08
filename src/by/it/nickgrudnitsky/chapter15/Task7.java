package by.it.nickgrudnitsky.chapter15;


import by.it.nickgrudnitsky.myLibrary.Generator;

import java.util.*;

public class Task7 implements Iterable<Integer>, Generator<Integer> {

    private int size;
    private int count = 0;

    public Task7(int size) {
        this.size = size;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public Integer next() {
                return fib(count++);
            }
        };
    }


    @Override
    public Integer next() {
        return fib(count++);
    }

    public Integer fib(int number) {
        if (number < 2) return 1;
        return fib(number - 1) + fib(number - 2);
    }


    public static void main(String[] args) {
        Task7 fibonacci = new Task7(10);
        for (Integer fib : fibonacci) {
            System.out.println(fib);
        }
    }
}
