package by.it.nickgrudnitsky.chapter12;

public class Task4and28 {
    static void f() throws MyExeption {
        throw new MyExeption("MY ERROR!");
    }

    public static void main(String[] args) {
        f();
    }
}

class MyExeption extends RuntimeException {
    public MyExeption() {
    }

    public MyExeption(String message) {
        super(message);
    }
}
