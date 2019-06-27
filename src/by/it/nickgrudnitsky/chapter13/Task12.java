package by.it.nickgrudnitsky.chapter13;


import java.util.HashSet;
import java.util.Set;
import java.util.regex.*;

import static by.it.nickgrudnitsky.myLibrary.Print.print;
import static by.it.nickgrudnitsky.myLibrary.Print.printnb;


public class Task12 {
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Set<String> wordSet = new HashSet<>();
        Matcher m =
                Pattern.compile("(^[a-z]|\\s+[a-z])\\w+")
                        .matcher(POEM);
        while (m.find()) {
            wordSet.add(m.group());
        }
        for (String s : wordSet) {
            System.out.println(s + " ");
        }
        System.out.println("Total " + wordSet.size());
    }
}