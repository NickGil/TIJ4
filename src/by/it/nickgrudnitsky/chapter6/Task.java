package by.it.nickgrudnitsky.chapter6;


import by.it.nickgrudnitsky.chapter6.debug.Main;


public class Task {
    public static void main(String[] args) {
        Main.debug("s");
        by.it.nickgrudnitsky.chapter6.debugoff.Main.debug("s");
    }
}