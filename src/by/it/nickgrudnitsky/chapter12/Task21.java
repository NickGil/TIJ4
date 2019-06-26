package by.it.nickgrudnitsky.chapter12;

public class Task21 {
    public static void main(String[] args) {
        try {
            Son son = new Son();
        } catch (ExeptionType1 e) {

        }
    }
}

class Mumy {
    public Mumy() throws ExeptionType1 {
    }
}

class Son extends Mumy {
    public Son() throws ExeptionType1 {
    }
}