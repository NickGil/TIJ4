package by.it.nickgrudnitsky.chapter15;

import java.util.ArrayList;
import java.util.Random;

public class Task6<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random();

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        Task6<String> rs = new Task6<>();
        for (String s : ("The quick brown fox jumped over " +
                "the lazy brown dog").split(" "))
            rs.add(s);
        for (int i = 0; i < 11; i++)
            System.out.print(rs.select() + " ");
        System.out.println();
        Task6<Integer> rndList = new Task6<>();
        for (int i = 0; i < 10; i++) {
            rndList.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(rndList.select() + " ");
        }

        System.out.println();
        char[] chars = "ABCDEFGHIJ".toCharArray();
        Task6<Character> rndList2 = new Task6<>();
        for (char aChar : chars) {
            rndList2.add(aChar);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(rndList2.select() + " ");
        }
    }
}