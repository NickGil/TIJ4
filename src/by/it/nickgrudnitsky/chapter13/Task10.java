package by.it.nickgrudnitsky.chapter13;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    public static void main(String[] args) {
        String text= "Java now has regular expressions";
        Matcher matcher = Pattern.compile("^Java").matcher(text);
        Matcher matcher1 = Pattern.compile("\\Breg.*").matcher(text);
        Matcher matcher2 = Pattern.compile("n.w\\s+h(a|i)s").matcher(text);
        Matcher matcher3 = Pattern.compile("s?").matcher(text);
        Matcher matcher4 = Pattern.compile("s*").matcher(text);
        Matcher matcher5 = Pattern.compile("s+").matcher(text);
        Matcher matcher6 = Pattern.compile("s{4}").matcher(text);
        Matcher matcher7 = Pattern.compile("s{1}").matcher(text);
        Matcher matcher8 = Pattern.compile("s{0,3}").matcher(text);
        ArrayList<Matcher> list = new ArrayList<>();
        list.add(matcher);
        list.add(matcher1);
        list.add(matcher2);
        list.add(matcher3);
        list.add(matcher4);
        list.add(matcher5);
        list.add(matcher6);
        list.add(matcher7);
        list.add(matcher8);
        for (Matcher mtc : list) {
            while (mtc.find()){
                System.out.println(mtc.group());
            }
        }
    }
}
