package by.it.nickgrudnitsky.chapter10;


public class Task11 {
    public static void main(String[] args) {
        System.out.println(Ex11.change("Hello World!!"));
    }
}

class Ex11  {
    public static String change(String s) {
        char[] chars = s.toCharArray();
        char[] newString = new char[chars.length];
        if (chars.length % 2 == 0) {
            for (int i = 0; i < chars.length; i = i + 2) {
                newString[i] = chars[i + 1];
                newString[i + 1] = chars[i];
            }
        } else {
            for (int i = 0; i < chars.length - 1; i = i + 2) {
                newString[i] = chars[i + 1];
                newString[i + 1] = chars[i];
            }
            newString[newString.length - 1] = chars[chars.length - 1];
        }
        String rezult = new String(newString);
        return rezult;
    }
}
