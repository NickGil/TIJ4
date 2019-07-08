package by.it.nickgrudnitsky.chapter15;


import by.it.nickgrudnitsky.myLibrary.BasicGenerator;
import by.it.nickgrudnitsky.myLibrary.Generator;

public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen =
                new BasicGenerator<>(CountedObject.class);
        for (int i = 0; i < 5; i++)
            System.out.println(gen.next());
    }
}