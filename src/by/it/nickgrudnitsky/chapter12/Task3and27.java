package by.it.nickgrudnitsky.chapter12;

public class Task3and27 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR");
            throw new RuntimeException(e);
        }
    }
}
