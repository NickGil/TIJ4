package by.it.nickgrudnitsky.chapter7;

public class Task18 {
    public static void main(String[] args) {
        System.out.println(StickClass.x);
        StickClass.x = 2;
        System.out.println(StickClass.x);
        System.out.println(StickClass.z);
        //StickClass.z = 2; final constant
    }
}

class StickClass {
    static int x = 1;
    static final int z = 1;
}
