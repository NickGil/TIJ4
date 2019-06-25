package by.it.nickgrudnitsky.chapter12;

public class Task1 {
    public static void main(String[] args) {
        try {
            function();
        } catch (Exeption1 e) {
            System.out.println("OOPS");
            e.printStackTrace();
        }
    }

    static void function() throws Exeption1{
     throw new Exeption1("Fail");
    }
}

class Exeption1 extends Exception {
    public Exeption1(String message) {
        super(message);
    }
}
