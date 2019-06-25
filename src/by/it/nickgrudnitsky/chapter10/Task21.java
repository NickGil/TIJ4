package by.it.nickgrudnitsky.chapter10;

public class Task21 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        B b = new B();

        b.saveU(a1.createU());
        b.saveU(a2.createU());
        b.saveU(a3.createU());

        b.callU();

        b.resetU(1);

        b.callU();
    }
}

interface U {
    void f1();
    void f2();
    void f3();
}

class A {
    U createU (){
        return new U() {
            @Override
            public void f1() {
                System.out.println(1);
            }

            @Override
            public void f2() {
                System.out.println(2);
            }

            @Override
            public void f3() {
                System.out.println(3);
            }
        };
    }
}

class B {
    private U[] uArray = new U[3];
    private int count = 0;
    void saveU (U u){
        if (count < uArray.length){
            uArray[count++] = u;
        }
    }

    void resetU (int place) {
        if (place < uArray.length && place > 0) {
            uArray[place] = null;
        }
    }

    void callU () {
        for (U u : uArray) {
            u.f1();
            u.f2();
            u.f3();
        }
    }
}
