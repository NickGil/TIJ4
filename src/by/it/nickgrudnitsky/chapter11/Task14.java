package by.it.nickgrudnitsky.chapter11;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task14 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5};
        /*insertIntegers(linkedList, integers);*/
        insertIntegers2(linkedList, integers);
        System.out.println(linkedList);
    }

    private static void insertIntegers(LinkedList li, Integer[] integers) {
        Integer[] integers1;
        if (integers.length != 0) {
            ListIterator listIterator = li.listIterator(li.size() / 2);
            listIterator.add(integers[0]);
            if (integers.length != 1) {
                integers1 = new Integer[integers.length - 1];
            } else {
                return;
            }
            for (int i = 1; i < integers.length; i++) {
                integers1[i-1] = integers[i];
            }
            insertIntegers(li, integers1);
        }
    }

    private static void insertIntegers2(LinkedList li, Integer[] integers) {
        for (Integer integer : integers) {
            ListIterator listIterator = li.listIterator(li.size() / 2);
            listIterator.add(integer);
        }
    }
}
