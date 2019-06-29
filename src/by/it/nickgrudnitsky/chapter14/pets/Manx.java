package by.it.nickgrudnitsky.chapter14.pets;

public class Manx extends Cat {
    public class Factory implements by.it.nickgrudnitsky.chapter14.factory.Factory<Manx> {

        @Override
        public Manx create() {
            return new Manx();
        }
    }
    public Manx(String name) {
        super(name);
    }

    public Manx() {
        super();
    }
}
