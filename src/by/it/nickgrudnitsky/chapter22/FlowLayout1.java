package by.it.nickgrudnitsky.chapter22;//: gui/FlowLayout1.java
// Demonstrates FlowLayout.

import javax.swing.*;
import java.awt.*;

import static by.it.nickgrudnitsky.myLibrary.SwingConsole.run;


public class FlowLayout1 extends JFrame {
  public FlowLayout1() {
    setLayout(new FlowLayout());
    for(int i = 0; i < 20; i++)
      add(new JButton("Button " + i));
  }
  public static void main(String[] args) {
    run(new FlowLayout1(), 300, 300);
  }
} ///:~
