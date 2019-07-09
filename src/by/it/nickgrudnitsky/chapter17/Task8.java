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


    SListIterator<T> iterator() {
        return new SListIterator<>(first);
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

    public class SListIterator<C> {
        int cursor = 0;
        private Cell<C> current;

        SListIterator(Cell<C> first) {
            current = first;
        }

        public boolean hasNext() {
            if (cursor++ == 0) {
                return current != null;
            }
            return current != null;
        }

        public Cell<C> next() {
            Cell<C> buffer = current;
            current = current.next;
            return buffer;
        }

        public void remove() {
            if(current.next != null) {
                current.next = current.next.next;
            }
        }

        void insert(C inserted) {
            for (int i = 0; i < size-1; i++) {
                current = current.next;
            }
            current.next = new Cell<>(inserted);
            size++;
        }

        void insert(C inserted, int posotion) {
            current = (Cell)first;
            Cell<C> newCell = new Cell<>(inserted);
            if (posotion == 1) {
                newCell.next = current;
                first = (Cell<T>) newCell;
                size++;
                return;
            }
            for (int i = 0; i < posotion-2; i++) {
                current = current.next;
            }
            newCell.next = current.next;
            current.next = newCell;
            size++;
        }
    }


    @Override
    public String toString() {
        if (first == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        SListIterator<T> iterator = iterator();
        sb.append("[");
        while (iterator.hasNext()) {
            sb.append(iterator.next()).append(iterator.hasNext() ? ", " : "" );

        }
        sb.substring(2);
        sb.append("]");
        return sb.toString();
    }
}

public class Task8 {
    public static void main(String[] args) {
        SList<Integer> list = new SList<>(Arrays.asList(1, 2, 3));
        SList<Integer> list2 = new SList<>(Collections.singletonList(1));
        SList<Integer> list3 = new SList<>();
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
        SList<Integer>.SListIterator<Integer> iterator = list.iterator();
        iterator.insert(4);
        System.out.println(list);
        iterator.insert(5,1);
        System.out.println(list);
        iterator.insert(6,6);
        System.out.println(list);
        iterator.remove();
        System.out.println(list);
    }
}