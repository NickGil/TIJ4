package by.it.nickgrudnitsky.chapter13;

public class Task6 {
    public static void main(String[] args) {
        Ex6 test = new Ex6(1,2,3,4);
        System.out.println(test);
    }
}

class Ex6 {
    private int a;
    private long b;
    private float c;
    private double d;

    public Ex6(int a, long b, float c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return String.format("%-4d %-4d %-4.2f %-5.2f", a, b, c, d);
    }
}
