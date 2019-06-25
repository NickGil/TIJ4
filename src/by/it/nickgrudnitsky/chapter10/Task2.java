package by.it.nickgrudnitsky.chapter10;


public class Task2 {
    private Object[] items;
    private int next = 0;
    public Task2(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }

        public Task2 returnTask2(){
            return Task2.this;
        }
    }

    private class ReverseSelector implements Selector {
        private int i = items.length;
        public boolean end() { return i == 0; }
        public Object current() { return items[i-1]; }
        public void next() { if(i > 0) i--; }

        public Task2 returnTask2(){
            return Task2.this;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }
    public Selector reverseSelector() {
        return new ReverseSelector();
    }
    public static void main(String[] args) {

        Task2 sequence = new Task2(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        Selector selector2 = sequence.reverseSelector();

        while(!selector2.end()) {
            System.out.print(selector2.current() + " ");
            selector2.next();
        }
    }
}

class Map {
    String country = "France";
    String returnCountry(){
        return country;
    }

}

interface Selector {
    boolean end();
    Object current();
    void next();
}
