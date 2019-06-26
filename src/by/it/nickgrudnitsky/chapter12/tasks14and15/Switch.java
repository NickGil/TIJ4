package by.it.nickgrudnitsky.chapter12.tasks14and15;

import static by.it.nickgrudnitsky.myLibrary.Print.print;

public class Switch {
  private boolean state = false;
  public boolean read() { return state; }
  public void on() { state = true; print(this); }
  public void off() { state = false; print(this); }
  public String toString() { return state ? "on" : "off"; }
}

