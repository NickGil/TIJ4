package by.it.nickgrudnitsky.chapter10;

public class Task16 {
    public Task16() {
        System.out.println("Plane");
    }

    static class Engine {
        public Engine() {
            System.out.println("Engine");
        }
    }
    public static void main(String[] args) {
        Engine engine = new Engine();
    }
}

