package by.it.nickgrudnitsky.chapter22;

import by.it.nickgrudnitsky.myLibrary.SwingConsole;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

import static by.it.nickgrudnitsky.myLibrary.SwingConsole.run;

public class SubmitSwingProgram extends JFrame {
  JLabel label;
  public SubmitSwingProgram() {
    label = new JLabel("A Label");
    add(label);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  static SubmitSwingProgram ssp;

  public static void main(String[] args) throws Exception {
    run(ssp = new SubmitSwingProgram() , 1200, 700);
    TimeUnit.SECONDS.sleep(5);
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        ssp.label.setText("Hey! This is Different!");
      }
    });
  }
}
