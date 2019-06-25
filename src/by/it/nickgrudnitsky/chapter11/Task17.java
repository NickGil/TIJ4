package by.it.nickgrudnitsky.chapter11;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task17 {
    public static void main(String[] args) {
        Map<String, Gerbil> gerbilMap = new HashMap<>();
        gerbilMap.put("John", new Gerbil(1));
        gerbilMap.put("Dan", new Gerbil(2));
        gerbilMap.put("Steev", new Gerbil(3));

        Iterator<String> iterator = gerbilMap.keySet().iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            gerbilMap.get(next).hop();
        }
    }
}
