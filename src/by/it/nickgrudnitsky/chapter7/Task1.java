package by.it.nickgrudnitsky.chapter7;

public class Task1 {
    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass();
        System.out.println(secondClass);
    }

}

class SecondClass {
    private SimpleClass newSimpleClass;

    @Override
    public String toString() {
        if (newSimpleClass == null) newSimpleClass = new SimpleClass();
        return "SecondClass{" +
                "newSimpleClass=" + newSimpleClass +
                '}';
    }
}

class SimpleClass {
    @Override
    public String toString() {
        return "SimpleClass{}";
    }
}
