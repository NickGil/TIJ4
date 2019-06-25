package by.it.nickgrudnitsky.chapter11;//: holding/Statistics.java
// Simple demonstration of HashMap.

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {
  public static void main(String[] args) {
    Random rand = new Random();
    Map<Integer,Integer> m =
      new HashMap<>();
    for(int i = 0; i < 10000000; i++) {
      int r = rand.nextInt(20);
      Integer freq = m.get(r);
      m.put(r, freq == null ? 1 : freq + 1);
    }
    int maxValue = 0;
    int maxValueKey = 0;
    for (Integer value : m.values()) {
      if (value > maxValue) {
        maxValue = value;
      }
    }
    for (Integer integer : m.keySet()) {
      if (m.get(integer).equals(maxValue)){
        maxValueKey = integer;
      }
    }
    System.out.println("Чаще всего повторяется число " + maxValueKey + " - " + maxValue + " раз");
  }
}
