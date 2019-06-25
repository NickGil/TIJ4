package by.it.nickgrudnitsky.chapter5;

public class Task9 {
    public static void main(String[] args) {
        TwoMethods a = new TwoMethods("s");
    }

}

class TwoMethods {

    public TwoMethods(String s) {
        this(0);
        System.out.println(" sexy");
    }

    public TwoMethods(int x) {
        System.out.println("Hello");
    }

}
