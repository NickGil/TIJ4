package by.it.nickgrudnitsky.chapter7;

public class Task20to22 {
    public static void main(String[] args) {
        Second second = new Second();
        second.f();
        First first = new First();
        //first.f();
        First first1 = new Second();
        //first1.f();

        second.z();
        first.z();
        first1.z();

    }
}

class First {
    private void f() {
        System.out.println(1);
    }

    final void z() {
        System.out.println("final");
    }
}

class Second extends First {
    void f() {
        System.out.println(2);
    }
    /*void z(){

    }*/
}

final class FinalClass {
    int x = 2;
    void z(){
        System.out.println(1);
    }
}

/*class NotFinal extends FinalClass {

}*/
