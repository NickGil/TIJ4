package by.it.nickgrudnitsky.chapter11;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrayList.add(new Gerbil(i));
        }
        Iterator<Gerbil> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Gerbil next = iterator.next();
            next.hop();
        }
    }
}

class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    void hop() {
        System.out.println(gerbilNumber + " Hi!");
    }
}
