package by.it.nickgrudnitsky.chapter22;//: strings/TestRegularExpression.java
// Allows you to easily try out regular expressions.
// {Args: abcabcabcdefabc "abc+" "(abc)+" "(abc){2,}" }

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.it.nickgrudnitsky.myLibrary.SwingConsole.run;


public class TestRegularExpression extends JFrame {

    private JButton
            b1 = new JButton("Test"),
            b2 = new JButton("Reset");
    private JTextArea textInput = new JTextArea(20, 40);
    private JTextArea textOutput = new JTextArea(20, 40);
    private JTextField textField = new JTextField(10);

    public TestRegularExpression() {
        b1.addActionListener(e -> {
            if (textInput.getText().isEmpty() || textField.getText().isEmpty()) {
                textOutput.setText("Usage:\njava TestRegularExpression " +
                        "characterSequence regularExpression+");
            } else {
                textOutput.setText("");
                textOutput.append("Input: \"" + textInput.getText() + "\"");

                Matcher matcher = Pattern.compile(textField.getText()).matcher(textInput.getText());
                while (matcher.find()) {
                    textOutput.append("Match \"" + matcher.group() + "\" at positions " +
                            matcher.start() + "-" + (matcher.end() - 1) + "\n");
                }
            }
        });
        b2.addActionListener(e -> {
            textInput.setText("");
            textField.setText("");
            textOutput.setText("");
        });

        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(new JScrollPane(textInput));
        add(new JScrollPane(textOutput));
        add(textField);
    }

    public static void main(String[] args) {
        run(new TestRegularExpression(), 1200, 700);
    }
} /* Output:
Input: "abcabcabcdefabc"
Regular expression: "abcabcabcdefabc"
Match "abcabcabcdefabc" at positions 0-14
Regular expression: "abc+"
Match "abc" at positions 0-2
Match "abc" at positions 3-5
Match "abc" at positions 6-8
Match "abc" at positions 12-14
Regular expression: "(abc)+"
Match "abcabcabc" at positions 0-8
Match "abc" at positions 12-14
Regular expression: "(abc){2,}"
Match "abcabcabc" at positions 0-8
*///:~
