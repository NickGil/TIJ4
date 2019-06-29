package by.it.nickgrudnitsky.chapter14.pets;

public class Gerbil extends Rodent {
    public class Factory implements by.it.nickgrudnitsky.chapter14.factory.Factory<Gerbil> {

        @Override
        public Gerbil create() {
            return new Gerbil();
        }
    }
    public Gerbil(String name) {
        super(name);
    }

    public Gerbil() {
        super();
    }
}
