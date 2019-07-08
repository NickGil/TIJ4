package by.it.nickgrudnitsky.chapter16;

import java.util.Arrays;

public class Task20 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int[][] b = new int[5][5];
        int[][] c = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            Arrays.fill(a[i], i);
            Arrays.fill(b[i], i);
            Arrays.fill(c[i], i+1);
        }
        System.out.println(Arrays.deepEquals(a,b));
        System.out.println(Arrays.deepEquals(a,c));
    }
}
