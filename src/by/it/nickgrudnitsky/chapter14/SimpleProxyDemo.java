package by.it.nickgrudnitsky.chapter14;

import static by.it.nickgrudnitsky.myLibrary.Print.print;


interface Interface {
    void doSomething();

    void somethingElse(String arg);
}

class RealObject implements Interface {
    public void doSomething() {
        print("doSomething");
    }

    public void somethingElse(String arg) {
        print("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {
    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    public void doSomething() {
        long t1 = System.currentTimeMillis();
        print("SimpleProxy doSomething");
        proxied.doSomething();
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
    }

    public void somethingElse(String arg) {
        long t1 = System.currentTimeMillis();
        print("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
    }
}



class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject realObject = new RealObject();
        consumer(realObject);
        consumer(new SimpleProxy(realObject));
    }
}