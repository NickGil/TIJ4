package by.it.nickgrudnitsky.chapter12;

public class Task5 {
    public static void main(String[] args) {
        int i = 0;
        while (i != 4) {
            try {
                System.out.println(10 / i);
                i++;
            } catch (ArithmeticException e) {
                System.out.println("Exeption was catch");
                i++;
            }
        }
    }
}
