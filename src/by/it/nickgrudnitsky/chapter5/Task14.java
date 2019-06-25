package by.it.nickgrudnitsky.chapter5;

public class Task14 {
    public static void main(String[] args) {
        Test13.staticMethod();
    }
}

class Test13 {
    static String s = "test ";
    static int x;

    static {
        x = 2;
    }

    static void staticMethod() {
        System.out.println(s + x);
    }
}