package by.it.nickgrudnitsky.chapter14.pets;

public class Pug extends Dog {
    public class Factory implements by.it.nickgrudnitsky.chapter14.factory.Factory<Pug> {

        @Override
        public Pug create() {
            return new Pug();
        }
    }
    public Pug(String name) {
        super(name);
    }

    public Pug() {
        super();
    }
}
