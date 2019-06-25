package by.it.nickgrudnitsky.chapter8;

public class Task9 {
    public static void main(String[] args) {
        Rodent[] rodents = {new Mouse(), new Hamster(), new Mouse()};
        for (Rodent rodent : rodents) {
            rodent.emit();
            rodent.gnaw();
        }
    }
}

class Rodent{

    public Rodent() {
        System.out.println("rodent");
    }

    void emit(){
        System.out.println("emit");
    }

    void gnaw(){
        System.out.println("gnaw");
    }
}

class Mouse extends Rodent {

    public Mouse() {
        System.out.println("mouse");
    }

    @Override
    void emit() {
        System.out.println("squeak");
    }

    @Override
    void gnaw() {
        System.out.println("gnaw like a mouse");
    }
}

class Hamster extends Rodent {

    public Hamster() {
        System.out.println("hamster");
    }

    @Override
    void emit() {
        System.out.println("peep");
    }

    @Override
    void gnaw() {
        System.out.println("gnaw like a hamster");
    }
}
