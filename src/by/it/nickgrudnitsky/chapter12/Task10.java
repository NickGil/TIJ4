package by.it.nickgrudnitsky.chapter12;

public class Task10 {
    public static void main(String[] args) {
        try {
            TwoMethods.f();
        } catch (Exception e ){
            System.out.println("2");
            e.printStackTrace();
        }
    }
}

class TwoMethods {
    static void f() throws ExeptionType2 {
        try {
            g();
        } catch (ExeptionType1 e) {
            System.out.println("1");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    static void g() throws ExeptionType1 {
        throw new ExeptionType1();
    }
}
