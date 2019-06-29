package by.it.nickgrudnitsky.chapter14.pets;

public class Rat extends Rodent {
    public class Factory implements by.it.nickgrudnitsky.chapter14.factory.Factory<Rat> {

        @Override
        public Rat create() {
            return new Rat();
        }
    }
    public Rat(String name) {
        super(name);
    }

    public Rat() {
        super();
    }
}
