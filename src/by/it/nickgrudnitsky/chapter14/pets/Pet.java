package by.it.nickgrudnitsky.chapter14.pets;

public class Pet extends Individual {
    public class Factory implements by.it.nickgrudnitsky.chapter14.factory.Factory<Pet> {

        @Override
        public Pet create() {
            return new Pet();
        }
    }
    public Pet(String name) {
        super(name);
    }

    public Pet() {
        super();
    }
}
