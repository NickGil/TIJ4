package by.it.nickgrudnitsky.chapter9;

public class Task18 {
    private static void runCycle(CycleFactory factory){
        Cycle cycle = factory.getCycle();
        cycle.run();
    }
    public static void main(String[] args) {
        runCycle(new UnicycleFactory());
        runCycle(new BycycleFactory());
        runCycle(new TricycleFactory());
    }
}

interface Cycle {
    void run();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    @Override
    public void run() {
        System.out.println("Unicycle run");
    }
}

class Bycycle implements Cycle {
    @Override
    public void run() {
        System.out.println("Bycycle run");
    }
}

class Tricycle implements Cycle {
    @Override
    public void run() {
        System.out.println("Tricycle run");
    }
}

class UnicycleFactory implements CycleFactory {
    public Cycle getCycle(){
        return new Unicycle();
    }
}

class BycycleFactory implements CycleFactory {
    public Cycle getCycle(){
        return new Bycycle();
    }
}

class TricycleFactory implements CycleFactory {
    public Cycle getCycle(){
        return new Tricycle();
    }
}