package by.it.nickgrudnitsky.chapter10;

public class Task18 implements CanFight {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
    }
}

interface CanFight {
    static class Fighter {
        public Fighter() {
            System.out.println("Fighter");
        }
    }
}
