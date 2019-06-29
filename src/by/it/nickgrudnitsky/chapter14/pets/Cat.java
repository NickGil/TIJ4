package by.it.nickgrudnitsky.chapter14.pets;

public class Cat extends Pet {
    public class Factory implements by.it.nickgrudnitsky.chapter14.factory.Factory<Cat> {

        @Override
        public Cat create() {
            return new Cat();
        }
    }

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }
}
