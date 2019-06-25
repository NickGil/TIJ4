package by.it.nickgrudnitsky.chapter10;

public class Task24 {
    class Inner extends OuterClass.Inner {

        public Inner(int x, OuterClass outerClass) {
            outerClass.super(x);
        }
    }
}

class OuterClass {
    class Inner {
        int x = 0;
        public Inner(int x) {
            this.x = x;
        }
    }
}
