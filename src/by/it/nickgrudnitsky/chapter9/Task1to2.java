package by.it.nickgrudnitsky.chapter9;


public class Task1to2 {
    public static void main(String[] args) {
        Rodent[] rodents = {new Mouse(), new Hamster(), new Mouse()};
        for (Rodent rodent : rodents) {
            rodent.emit();
            rodent.gnaw();
        }
    }
}


interface Rodent{

    void emit();

    void gnaw();
}

class Mouse implements Rodent {

    public Mouse() {
        System.out.println("mouse");
    }

    @Override
    public void emit() {
        System.out.println("squeak");
    }

    @Override
    public void gnaw() {
        System.out.println("gnaw like a mouse");
    }
}

class Hamster implements Rodent {

    public Hamster() {
        System.out.println("hamster");
    }

    @Override
    public void emit() {
        System.out.println("peep");
    }

    @Override
    public void gnaw() {
        System.out.println("gnaw like a hamster");
    }
}
