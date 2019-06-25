package by.it.nickgrudnitsky.chapter7;

public class Task9 {
    public static void main(String[] args) {
        Steam steam = new Steam(1);

    }
}

class Steam extends Root {
    Component1 component1 = new Component1(1);
    Component2 component2 = new Component2(1);
    Component3 component3 = new Component3(1);

    public Steam(int i) {
        super(i);
        System.out.println(5);
    }
}

class Root {
    Component1 component1 = new Component1(1);
    Component2 component2 = new Component2(1);
    Component3 component3 = new Component3(1);

    public Root(int i) {
        System.out.println(4);
    }
}

class Component1 {
    public Component1(int i) {
        System.out.println(1);
    }
}

class Component2 {
    public Component2(int i) {
        System.out.println(2);
    }
}

class Component3 {
    public Component3(int i) {
        System.out.println(3);
    }
}