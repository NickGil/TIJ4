package by.it.nickgrudnitsky.chapter10;

public class Task19 {
    public static void main(String[] args) {
        Froooog frog = new Froooog();
        Animal.Frog.runAnimal(frog);
    }
}

class Froooog implements Animal {
    @Override
    public void saysmth() {
        System.out.println("?");
    }
}

interface Animal {

    void saysmth();

    static class Frog {
        static void runAnimal(Animal a){
            a.saysmth();
        }
    }
}
