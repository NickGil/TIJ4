package by.it.nickgrudnitsky.chapter12;

public class Task8 {
    public static void main(String[] args) {
        try {
            ExeptionTest.f();
        } catch (MyExeption e) {
            System.out.println("nice");
        }
    }
}

class ExeptionTest {
    static void f() throws MyExeption {
        throw new MyExeption();
    }
}