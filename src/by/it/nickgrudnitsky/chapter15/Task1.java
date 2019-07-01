package by.it.nickgrudnitsky.chapter15;

import by.it.nickgrudnitsky.typeinfo.pets.Pet;

public class Task1<T> {
    private T a;

    public Task1(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        Task1<Pet> holder = new Task1<>(new Pet());
        Pet pet = holder.get();
    }
}
