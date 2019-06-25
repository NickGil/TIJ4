package by.it.nickgrudnitsky.chapter7;

public class Task16 {
    public static void main(String[] args) {
        Amphibian frog = new Frog();
        frog.a();
        frog.b();
    }
}

class Amphibian {
    void a(){
        System.out.println(1);
    }

    void b(){
        System.out.println(1);
    }
}

class Frog extends Amphibian {
    @Override
    void a() {
        System.out.println(2);
    }

    @Override
    void b() {
        System.out.println(2);
    }
}
