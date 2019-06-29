package by.it.nickgrudnitsky.chapter14.pets;

public class Cymric extends Manx {
    public class Factory implements by.it.nickgrudnitsky.chapter14.factory.Factory<Cymric> {

        @Override
        public Cymric create() {
            return new Cymric();
        }
    }

    public Cymric(String name) {
        super(name);
    }

    public Cymric() {
        super();
    }
}
