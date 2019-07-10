package by.it.nickgrudnitsky.chapter22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import static by.it.nickgrudnitsky.myLibrary.SwingConsole.run;

public class Task10 extends JFrame {

    private JTextField text = new JTextField(10);

    private Task10() {
        JButton b = new JButton("Focused");
        b.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                text.setText(text.getText() + e.getKeyChar());
            }
        });
        JPanel top = new JPanel();
        top.add(b);
        top.add(text);
        JButton b1 = new JButton("Not focused");
        top.add(b1);
        add(BorderLayout.NORTH, top);
    }


    public static void main(String[] args) {
        run(new Task10(), 1200, 700);
    }

}
