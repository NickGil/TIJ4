package by.it.nickgrudnitsky.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task12 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list2 = new ArrayList<>(5);
        ListIterator<Integer> listIterator = list.listIterator(5);
        while (listIterator.hasPrevious()){
            list2.add(listIterator.previous());
        }
        System.out.println(list + "\n" + list2);
    }
}
