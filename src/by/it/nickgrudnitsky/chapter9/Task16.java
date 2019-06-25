package by.it.nickgrudnitsky.chapter9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {


        Scanner s = new Scanner(new CharGenerator(5));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}

class CharGenerator implements Readable {
    private static Random random = new Random();
    private static final char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private int counter;

    public CharGenerator() {
        counter = 1;
    }

    public CharGenerator(int counter) {
        this.counter = counter;
    }

    String next() {
        char aChar = chars[random.nextInt(26)];
        return String.valueOf(aChar);
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (counter-- == 0) return -1;
        String result = next();
        cb.append(result);
        return result.length();

    }
}
