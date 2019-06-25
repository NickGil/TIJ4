package by.it.nickgrudnitsky.chapter10;

public class Task13 {
    public static void main(String[] args) {
        Diller diller = new Diller();
        diller.sell(2);
    }
}

class Car {
    public Car(int x) {
    }
}

class Diller {
    Car sell(int x){
        return new Car(x);
    }
}
