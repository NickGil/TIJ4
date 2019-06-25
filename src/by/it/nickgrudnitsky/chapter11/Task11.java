package by.it.nickgrudnitsky.chapter11;

import java.util.*;

public class Task11 {
    private static void iterate(Iterator<Collections> it){
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        Collection arrayList = new ArrayList(Arrays.asList(1,2,3));
        Collection linkedList = new LinkedList(Arrays.asList(1,2,3));
        Collection hashSet = new HashSet(Arrays.asList(1,2,3));
        Collection treeSet = new TreeSet(Arrays.asList(1,2,3));

        iterate(arrayList.iterator());
        iterate(linkedList.iterator());
        iterate(hashSet.iterator());
        iterate(treeSet.iterator());
    }
}


