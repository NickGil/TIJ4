package by.it.nickgrudnitsky.chapter5;

public class Task15 {
    public static void main(String[] args) {
        Test15 test15 = new Test15();
        test15.nonStaticMethod();
    }
}

class Test15 {
    String s = "test ";
    int x;

    {
        x = 2;
    }

    void nonStaticMethod() {
        System.out.println(s + x);
    }
}