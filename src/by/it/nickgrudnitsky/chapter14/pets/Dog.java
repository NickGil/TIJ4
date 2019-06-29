package by.it.nickgrudnitsky.chapter14.pets;

public class Dog extends Pet {

    public class Factory implements by.it.nickgrudnitsky.chapter14.factory.Factory<Dog> {

        @Override
        public Dog create() {
            return new Dog();
        }
    }
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super();
    }
}
