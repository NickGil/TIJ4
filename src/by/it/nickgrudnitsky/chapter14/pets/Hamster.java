package by.it.nickgrudnitsky.chapter14.pets;

public class Hamster extends Rodent {
    public class Factory implements by.it.nickgrudnitsky.chapter14.factory.Factory<Hamster> {

        @Override
        public Hamster create() {
            return new Hamster();
        }
    }
    public Hamster(String name) {
        super(name);
    }

    public Hamster() {
        super();
    }
}
