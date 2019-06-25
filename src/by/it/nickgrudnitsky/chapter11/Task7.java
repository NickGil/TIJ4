package by.it.nickgrudnitsky.chapter11;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        Tester[] t = new Tester[10];
        for (int i = 0; i < t.length; i++) {
            t[i] = new Tester();
        }
        for (Tester tester : t) {
            System.out.println(tester);
        }
        List<Tester> list = new ArrayList<>(Arrays.asList(t));
        System.out.println(list);
        List<Tester> subList = list.subList(2, 4);
        System.out.println(subList);
        list.removeAll(subList);
        System.out.println(list);
    }
}

class Tester {
    private static long counter;
    private final long id;

    public Tester() {
        id = counter++;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "id=" + id +
                '}';
    }
}
