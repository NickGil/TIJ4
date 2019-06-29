package by.it.nickgrudnitsky.chapter14.pets;

public class Mutt extends Dog {
    public class Factory implements by.it.nickgrudnitsky.chapter14.factory.Factory<Mutt> {

        @Override
        public Mutt create() {
            return new Mutt();
        }
    }
    public Mutt(String name) {
        super(name);
    }

    public Mutt() {
        super();
    }
}
