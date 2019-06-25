package by.it.nickgrudnitsky.chapter12;

public class Task2 {
    public static void main(String[] args) {
        String a = null;
        try {
            a.length();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
