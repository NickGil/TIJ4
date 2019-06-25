package by.it.nickgrudnitsky.chapter11;

import java.util.*;

public class Task24 {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<String, Integer> linkedHashMap2 = new LinkedHashMap<>();

        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Tree", 3);
        linkedHashMap.put("Four", 4);
        linkedHashMap.put("Five", 5);
        linkedHashMap.put("Six", 6);
        linkedHashMap.put("Seven", 7);
        linkedHashMap.put("Eight", 8);
        linkedHashMap.put("Nine", 9);
        linkedHashMap.put("Ten", 10);

        System.out.println("linkedHashMap " + linkedHashMap);

        Set<String> treeSet = new TreeSet<>(linkedHashMap.keySet());

        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Integer value = linkedHashMap.get(key);
            linkedHashMap2.put(key, value);
            linkedHashMap.remove(key);
        }

        Set<String> keys = linkedHashMap2.keySet();
        for (String key : keys) {
            linkedHashMap.put(key, linkedHashMap2.get(key));
        }


        System.out.println("linkedHashMap2 " + linkedHashMap2);
        System.out.println("linkedHashMap " + linkedHashMap);
    }
}
