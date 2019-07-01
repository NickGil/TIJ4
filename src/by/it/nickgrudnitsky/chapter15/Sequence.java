package by.it.nickgrudnitsky.chapter15;

import java.util.ArrayList;
import java.util.List;

interface Selector {
    boolean end();

    Object current();

    void next();

}
public class Sequence<T> {
    private List<T> list= new ArrayList<>();
    private int next = 0;

    public void add(T t) {
        list.add(t);
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == list.size();
        }

        public Object current() {
            return list.get(i);
        }

        public void next() {
            if (i < list.size()) i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence<String> sequence = new Sequence();
        for (int i = 0; i < 10; i++)
            sequence.add(i + " ы");
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
