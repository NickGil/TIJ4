package by.it.nickgrudnitsky.chapter9;

public class Task4 {
    static void method(Z z){
        z.print();
    }

    public static void main(String[] args) {
        method(new S());
    }
}

abstract class Z {
    abstract void print();
}

class S extends Z {
    void print(){}
}
