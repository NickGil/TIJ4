package by.it.nickgrudnitsky.chapter14.pets;

import by.it.nickgrudnitsky.chapter14.factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class PetFactory extends PetCreator {

    private static List<Factory<? extends Pet>> factories = new ArrayList<>();
    static {

    }

    public List<Factory<? extends Pet>> types() {
        return factories;
    }

    public static void main(String[] args) {

    }
}