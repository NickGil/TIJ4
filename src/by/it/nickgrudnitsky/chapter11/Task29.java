package by.it.nickgrudnitsky.chapter11;

import java.util.PriorityQueue;

public class Task29 {
    public static void main(String[] args) {
        PriorityQueue<SimplClass> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(new SimplClass());
        }
        System.out.println(priorityQueue);
    }
}

class SimplClass {

}
