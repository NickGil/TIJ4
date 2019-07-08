package by.it.nickgrudnitsky.chapter16;

import java.util.Random;

public class Task3 {
    static Integer[][] createArray(int i, int j, int from, int to) {
        Integer[][] array = new Integer[i][j];
        Random random = new Random();
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = random.nextInt(to - from + 1);
            }
        }
        return array;
    }

    static void printArray(Integer[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j != array[i].length - 1) System.out.print(", ");
            }
            System.out.print("]\n");
        }
    }

    public static void main(String[] args) {
        printArray(createArray(3, 3, 1, 10));
        printArray(createArray(10, 5, 1, 100));
    }
}
