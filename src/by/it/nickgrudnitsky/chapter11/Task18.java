package by.it.nickgrudnitsky.chapter11;

import java.util.*;

public class Task18 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Tree", 3);
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);
        hashMap.put("Six", 6);
        hashMap.put("Seven", 7);

        System.out.println("hashMap " + hashMap);

        Set<String> sortSet = new TreeSet<>(hashMap.keySet());
        System.out.println("treeSet " + sortSet);

        ex18(hashMap, sortSet);
        ex19(sortSet);

    }

    private static void ex19(Set<String> sortSet) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        for (String s : sortSet) {
            hashSet.add(s);
            linkedHashSet.add(s);
        }

        System.out.println("hashSet " + hashSet);
        System.out.println("LinkedHashSet " + linkedHashSet);
    }

    private static void ex18(Map<String, Integer> hashMap, Set<String> sortSet) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        for (String s : sortSet) {
            linkedHashMap.put(s, hashMap.get(s));
        }

        System.out.println("linkedHashMap " + linkedHashMap);
    }
}
