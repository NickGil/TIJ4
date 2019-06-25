package by.it.nickgrudnitsky.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        List<Rodent> rodents = new ArrayList<>(Arrays.asList(new Mouse(), new Hamster(), new Mouse()));
        Iterator<Rodent> iterator = rodents.iterator();
        while (iterator.hasNext()){
            Rodent next = iterator.next();
            next.emit();
            next.gnaw();
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
