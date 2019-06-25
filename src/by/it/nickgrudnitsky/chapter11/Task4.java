package by.it.nickgrudnitsky.chapter11;


import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Generator generator = new Generator();
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        TreeSet treeSet = new TreeSet();

        for (int i = 0; i < 4; i++) {
            String next = generator.next();
            arrayList.add(next);
            linkedList.add(next);
            hashSet.add(next);
            linkedHashSet.add(next);
            treeSet.add(next);
        }
        System.out.println(arrayList + "\n" + linkedList + "\n" + hashSet + "\n" + linkedHashSet + "\n" + treeSet);
    }
}

class Generator {
    private static int counter = 0;

    private List<String> nameList = new ArrayList<>(Arrays.asList("Forest", "Jenny", "Lieutenant Dan Taylor", "Benjamin Buford Bubba Blue"));

    String next(){
        if (counter == 4){
            counter = 1;
        }
        return nameList.get(counter++);
    }
}
