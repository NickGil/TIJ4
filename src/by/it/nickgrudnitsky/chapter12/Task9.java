package by.it.nickgrudnitsky.chapter12;

public class Task9 {
    static void f(int x) throws ExeptionType1, ExeptionType2, ExeptionType3 {
        if (x == 0) {
            throw new ExeptionType1();
        } else {
            if (x > 0) {
                throw new ExeptionType2();
            } else {
                throw new ExeptionType3();
            }
        }
    }

    public static void main(String[] args) {
        try {
            f(0);
        } catch (ExeptionType1 | ExeptionType2 | ExeptionType3 e) {
            if (e.getClass().getSimpleName().equals("ExeptionType1"))  {
                System.out.println("ExeptionType1 was found");
            } else {
                if (e.getClass().getSimpleName().equals("ExeptionType2")) {
                    System.out.println("ExeptionType2 was found");
                } else {
                    if (e.getClass().getSimpleName().equals("ExeptionType3")) {
                        System.out.println("ExeptionType3 was found");
                    }
                }
            }
        } finally {
            System.out.println("Finally");
        }
    }
}

class ExeptionType1 extends Exception {

}

class ExeptionType2 extends Exception {

}

class ExeptionType3 extends Exception {

}