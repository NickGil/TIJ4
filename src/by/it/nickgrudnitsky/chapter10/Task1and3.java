package by.it.nickgrudnitsky.chapter10;

public class Task1and3 {
    public static void main(String[] args) {
        Outer outer = new Outer("Test");
        Outer.Inner inner = outer.returnInner();
        System.out.println(inner);
    }
}

class Outer {
    private String text = "text";

    public Outer(String text) {
        this.text = text;
    }

    class Inner {
        @Override
        public String toString() {
            return text;
        }
    }

    public Inner returnInner() {
        return new Inner();
    }
}
