package by.it.nickgrudnitsky.chapter11;

import java.util.PriorityQueue;
import java.util.Random;

public class Task28 {
    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextDouble());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(priorityQueue.poll());
        }
    }
}
