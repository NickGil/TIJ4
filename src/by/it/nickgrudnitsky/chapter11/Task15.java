package by.it.nickgrudnitsky.chapter11;

import by.it.nickgrudnitsky.myLibrary.Stack;

public class Task15 {
    public static void main(String[] args) {
        String expression = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        read(expression);

    }

    private static void read(String expression) {
        char[] chars = expression.toCharArray();
        Stack<String> stack = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        for (int i = chars.length; i > 0; i--) {
            String s = String.valueOf(chars[i-1]);
            stack.push(s);
        }

        while (!stack.empty()){
            String pop = stack.pop();
            if (pop.equals("+")){
               stack2.push(stack.pop());
            } else {
                if (pop.equals("-")){
                    System.out.print(stack2.pop());
                }
            }
        }
    }
}

