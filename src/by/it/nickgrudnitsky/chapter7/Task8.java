package by.it.nickgrudnitsky.chapter7;

public class Task8 {
}

class Car {
    public Car(int i) {
        System.out.println("1");
    }
}

class Jeep extends Car{
    public Jeep(int i) {
        super(i);
    }

    public Jeep() {
        super(0);
    }
}
