//: innerclasses/controller/Controller.java
// The reusable framework for control systems.
package by.it.nickgrudnitsky.chapter10.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Controller {
  // A class from java.util to hold Event objects:
  private LinkedList<Event> eventList = new LinkedList<>();
  public void addEvent(Event c) { eventList.addLast(c); }
  public void run() {
    LinkedList<Event> eventListCoupy = new LinkedList<>(eventList);
    ListIterator<Event> listIterator = eventListCoupy.listIterator();
    while (listIterator.hasNext()){
      Event e = listIterator.next();
      if(e.ready()) {
        System.out.println(e);
        e.action();
        eventList.remove(e);
      }
    }
  }
} ///:~
