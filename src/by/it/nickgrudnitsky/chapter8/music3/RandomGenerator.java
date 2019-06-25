package by.it.nickgrudnitsky.chapter8.music3;

import java.util.Random;

public class RandomGenerator {

    static Instrument builder() {
        Random random = new Random();
        int i = random.nextInt(5) + 1;
        switch (i) {
            case 1: {
                return new Woodwind();
            }
            case 2: {
                return new Brass();
            }
            case 3: {
                return new Stringed();
            }
            case 4: {
                return new Percussion();
            }
            case 5: {
                return new Wind();
            }
        }
        return null;
    }
}
