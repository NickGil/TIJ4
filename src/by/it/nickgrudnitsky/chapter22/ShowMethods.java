package by.it.nickgrudnitsky.chapter22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

import static by.it.nickgrudnitsky.myLibrary.SwingConsole.run;


public class ShowMethods extends JFrame {

    private JTextField input = new JTextField();
    private JTextArea output = new JTextArea();

    class InPutListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String text = input.getText();
            if (text.isEmpty()) {
                output.append(usage);
            } else {
                int lines = 0;
                try {
                    Class<?> c = Class.forName(text);
                    Method[] methods = c.getMethods();
                    Constructor[] ctors = c.getConstructors();
                    for (Method method : methods) {
                        output.append(p.matcher(method.toString()).replaceAll(""));
                        output.append("\n");
                    }
                    for (Constructor ctor : ctors) {
                        output.append(p.matcher(ctor.toString()).replaceAll(""));
                        output.append("\n");
                    }
                } catch (ClassNotFoundException ex) {
                    output.append("No such class: " + ex);
                }
            }
        }
    }

    public ShowMethods() {
        InPutListner listner = new InPutListner();
        input.addActionListener(listner);
        JPanel top = new JPanel();
        top.add(new JLabel("Enter your class"));
        top.add(input);
        add(BorderLayout.NORTH, top);
        add(new JScrollPane(output));
        input.setText("by.it.nickgrudnitsky.chapter22.ShowAddListeners");
        listner.actionPerformed(new ActionEvent("", 0, ""));
    }

    private static String usage =
            "usage:\n" +
                    "ShowMethods qualified.class.name\n" +
                    "To show all methods in class or:\n" +
                    "ShowMethods qualified.class.name word\n" +
                    "To search for methods involving 'word'";
    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        run(new ShowMethods(), 1200, 700);
    }
}