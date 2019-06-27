package by.it.nickgrudnitsky.chapter13;

public class Task8 {
    public static void main(String[] args) {
        String[] split = Splitting.knights.split("the|you");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
