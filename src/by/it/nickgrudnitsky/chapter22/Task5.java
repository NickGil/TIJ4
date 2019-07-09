package by.it.nickgrudnitsky.chapter22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static by.it.nickgrudnitsky.myLibrary.SwingConsole.run;


public class Task5 extends JFrame {
    private JTextField text = new JTextField(10);
    private JButton
            b1 = new JButton("Кнопка 1"),
            b2 = new JButton("Кнопка 2"),
            b3 = new JButton("Кнопка 3");

    private ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = ((JButton)e.getSource()).getText();
            text.setText(name);
        }
    };

    public Task5() throws HeadlessException {
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(b3);
        add(text);
    }

    public static void main(String[] args) {
        run(new Task5(), 1200, 700);
    }
}
