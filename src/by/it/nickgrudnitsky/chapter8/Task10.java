package by.it.nickgrudnitsky.chapter8;

public class Task10 {
    public static void main(String[] args) {
        BaseClass dad = new ChildClass();
        dad.method1();
    }
}

class BaseClass {
    void method1(){
        method2();
    }

    void method2(){
        System.out.println(1);
    }
}

class ChildClass extends BaseClass {

    @Override
    void method2() {
        System.out.println(2);
    }
}
