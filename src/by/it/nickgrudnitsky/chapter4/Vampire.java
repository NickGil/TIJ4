package by.it.nickgrudnitsky.chapter4;



public class Vampire {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            check(1261);

        }
    }

    private static void check(int i) {
        int a = i / 1000;
        int b = (i - a * 1000) / 100;
        int c = (i - a * 1000 - b * 100) / 10;
        int d = (i - a * 1000 - b * 100 - c * 10) % 10;
        if (a == b || a == c || a == d || b == c || b == d || c == d) return;
        checkIfVampire(a, b, c, d);
    }

    private static void checkIfVampire(int a, int b, int c, int d) {
        if (combine(a, b, c, d)) return;
        if (combine(a, b, d, c)) return;
        if (combine(a, c, b, d)) return;
        if (combine(a, c, d, b)) return;
        if (combine(a, d, b, c)) return;
        if (combine(a, d, c, b)) return;
        if (combine(b, a, c, d)) return;
        if (combine(b, a, d, c)) return;
        if (combine(b, c, d, a)) return;
        if (combine(b, d, c, a)) return;
        if (combine(c, a, d, b)) return;
        if (combine(c, b, d, a)) return;


    }

    private static boolean combine(int a, int b, int c, int d) {
        int mul = (a * 10 + b) * (c * 10 + d);
        int a1 = mul / 1000;
        int b1 = (mul - a * 1000) / 100;
        int c1 = (mul - a * 1000 - b * 100) / 10;
        int d1 = (mul - a * 1000 - b * 100 - c * 10) % 10;
        if (a == a1 || a == b1 || a == c1 || a == d1){
            if (b == a1 ||b == b1 || b == c1 || b == d1){
                if (c == a1 ||c == b1 || c == c1 || c == d1){
                    if (d == a1 ||d == b1 || d == c1 || d == d1){
                        System.out.println(mul + "    " + a + b + "*" + c + d);
                        return true;
                    }
                }
            }
        }
        return false;
    }


}
