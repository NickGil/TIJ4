package by.it.nickgrudnitsky.chapter5;

public class Task3to4 {
    public static void main(String[] args) {
        Test test = new Test();
        Test test1 = new Test(" honney");
    }
}

class Test {

    public Test() {
        System.out.println("Hello1");
    }

    Test(String test) {
        System.out.println("Hello1" + test);
    }
}