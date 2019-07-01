package by.it.nickgrudnitsky.chapter15;

public class Task2<T> {
    private T a, b, c;

    public Task2(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public T getC() {
        return c;
    }

    public void setC(T c) {
        this.c = c;
    }

    public static void main(String[] args) {
        Task2<Task1> holder = new Task2<>(new Task1("1"), new Task1("2"), new Task1("3"));
        System.out.println(holder.getA().get());
        System.out.println(holder.getB().get());
        System.out.println(holder.getC().get());
    }
}


