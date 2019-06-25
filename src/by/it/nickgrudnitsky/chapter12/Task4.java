package by.it.nickgrudnitsky.chapter12;

public class Task4 {
    static void f() throws MyExeption{
        throw new MyExeption("MY ERROR!");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyExeption e) {
            e.printStackTrace();
        }
    }
}

class MyExeption extends Exception {
    public MyExeption() {
    }

    public MyExeption(String message) {
        super(message);
    }
}
