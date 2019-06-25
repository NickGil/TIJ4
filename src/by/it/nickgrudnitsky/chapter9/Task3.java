package by.it.nickgrudnitsky.chapter9;

public class Task3 {
    public static void main(String[] args) {
        B b = new B();
        b.print();
    }
}

abstract class A {
    abstract void print();

    public A() {
        print();
    }
}

class B extends A {
    int i = 0;
    @Override
    void print() {
        System.out.println(i);
    }
}