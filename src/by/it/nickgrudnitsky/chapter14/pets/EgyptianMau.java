package by.it.nickgrudnitsky.chapter14.pets;

public class EgyptianMau extends Cat {

    public class Factory implements by.it.nickgrudnitsky.chapter14.factory.Factory<EgyptianMau> {

        @Override
        public EgyptianMau create() {
            return new EgyptianMau();
        }
    }
    public EgyptianMau(String name) {
        super(name);
    }

    public EgyptianMau() {
        super();
    }
}
