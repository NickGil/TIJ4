package by.it.nickgrudnitsky.chapter14.pets;

public class Mouse extends Rodent {
    public class Factory implements by.it.nickgrudnitsky.chapter14.factory.Factory<Mouse> {

        @Override
        public Mouse create() {
            return new Mouse();
        }
    }
    public Mouse(String name) {
        super(name);
    }

    public Mouse() {
        super();
    }
}
