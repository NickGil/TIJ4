package by.it.nickgrudnitsky.chapter4;

import java.util.Random;

public class Chapter4 {
    public static void main(String[] args) {
        //ex18();
        //labelsGoto();
        //fibonacci(10);



    }






    int showFibonacciNumber(int n) {
        if(n < 2) return 1;
        return (showFibonacciNumber(n - 2) + showFibonacciNumber(n - 1));
    }

    static void fibonacci(int number) {
        if (number == 0) return;
        if (number == 1) {
            System.out.print("1, ");
        } else {
            System.out.print("1, 1, ");
        }
        int a = 1;
        int b = 1;
        for (int i = 1; i < number - 1; i++) {
            int next = a + b;
            a = b;
            b = next;
            System.out.print(next + ", ");
        }
    }

    private static void labelsGoto() {
        int i = 0;
        outer:
        // Can't have statements here
        for (; true; ) { // infinite loop
            inner:
            // Can't have statements here
            for (; i < 10; i++) {
                System.out.println("i = " + i);
                if (i == 2) {
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("break");
                    i++; // Otherwise i never
                    // gets incremented.
                    break;
                }
                if (i == 7) {
                    System.out.println("continue outer");
                    i++; // Otherwise i never
                    // gets incremented.
                    continue outer;
                }
                if (i == 8) {
                    System.out.println("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
    }

    private static void ex18() {
        Random random = new Random();
        int number = random.nextInt(100) + 2;
        int count = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println(number + " is not a prime number");
        } else {
            System.out.println(number + " is a prime number");
        }
    }
}
