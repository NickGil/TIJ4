package by.it.nickgrudnitsky.chapter7;

public class Task11 {

    Detergent1 detergent1 = new Detergent1();

    public void scrub() {
        detergent1.scrub();
    }

    public static void main(String[] args) {
        Task11 task2 = new Task11();
        task2.scrub();
    }
}

//: reusing/Detergent.java
// Inheritance syntax & properties.


class Cleanser1 {
    public Cleanser1() {
        System.out.println("1");
    }

    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}

class Detergent1 extends Cleanser1 {
    public Detergent1() {
        System.out.println(2);
    }

    // Change a method:
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Call base-class version
    }
    // Add methods to the interface:
    public void foam() { append(" foam()"); }
    // Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
} /* Output:
Cleanser dilute() apply() Detergent.scrub() scrub() foam()
Testing base class:
Cleanser dilute() apply() scrub()
*///:~
