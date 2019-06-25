package by.it.nickgrudnitsky.chapter11;

import java.util.LinkedList;
import java.util.Queue;

public class Task27 {
    public static void main(String[] args) {
        Command3.print(Commad2.fill());
    }
}

class Command {
    String field;

    public Command(String field) {
        this.field = field;
    }

    void operation() {
        System.out.println(field);
    }
}

class Commad2 {
    static Queue<Command> queue = new LinkedList<>();
    static Queue<Command> fill () {
        queue.add(new Command("1"));
        queue.add(new Command("2"));
        queue.add(new Command("3"));
        System.out.println(queue);
        return queue;
    }
}

class Command3 {
    static void print(Queue<Command> queue){
        for (Command command : queue) {
            command.operation();
        }
    }
}
