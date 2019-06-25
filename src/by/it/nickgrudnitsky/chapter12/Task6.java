package by.it.nickgrudnitsky.chapter12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Task6 {
    public static void main(String[] args) {
        try {
            throw new ExeptionOne();
        } catch (Exception e) {

        }
        try {
            throw new ExeptionTwo();
        } catch (Exception e) {

        }
    }

}

class ExeptionOne extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");
    public ExeptionOne() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class ExeptionTwo extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");
    public ExeptionTwo() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
