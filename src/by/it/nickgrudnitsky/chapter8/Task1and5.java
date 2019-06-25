package by.it.nickgrudnitsky.chapter8;

public class Task1and5 {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        Cycle cycle = new Cycle();

        cycle.ride(unicycle);
        cycle.ride(bicycle);
        cycle.ride(tricycle);

    }
}

class Cycle {

     void ride(Cycle a) {
         System.out.println(wheels(a));
    }

     int wheels(Cycle a) {
         if (a instanceof Unicycle) return 1;
         if (a instanceof Bicycle) return 2;
         if (a instanceof Tricycle) return 3;
        return 0;
    }
}

class Unicycle extends Cycle {

}

class Bicycle extends Cycle {

}

class Tricycle extends Cycle {

}
