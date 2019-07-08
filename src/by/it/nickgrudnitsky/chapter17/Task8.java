package by.it.nickgrudnitsky.chapter17;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class SList<T> {
    private int size = 0;
    private Cell<T> current;
    private Cell<T> first;

    SList() {
        first = null;
        current = null;
    }

    SList(Collection<? extends T> c) {
        for (T t : c) {
            if (current == null) {
                current = new Cell<>(t);
                first = current;
                size++;
                continue;
            }
            Cell<T> buffer = new Cell<>(t);
            current.next = buffer;
            current = buffer;
            size++;
        }
    }


    private class Cell<C> {
        Cell<C> next = null;
        C type;

        Cell(C type) {
            this.type = type;
        }


        @Override
        public String toString() {
            return type.toString();
        }
    }

    @Override
    public String toString() {
        if (first == null ){
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        Cell<T> next = first.next;
        sb.append("[");
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                sb.append(first.toString()).append(", ");
                continue;
            }
            if (i == size - 1) {
                sb.append(next.toString());
                continue;
            }
            sb.append(next.toString()).append(", ");
            next = next.next;
        }
        sb.append("]");
        return sb.toString();
    }
}

public class Task8 {
    public static void main(String[] args) {
        SList<Integer> list = new SList<>(Arrays.asList(1,2,3));
        SList<Integer> list2 = new SList<>(Collections.singletonList(1));
        SList<Integer> list3 = new SList<>();
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
    }
}