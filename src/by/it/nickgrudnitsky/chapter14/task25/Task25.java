package by.it.nickgrudnitsky.chapter14.task25;

import by.it.nickgrudnitsky.chapter14.ForEx25;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task25 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ForEx25 test = new ForEx25();
        for (Method declaredMethod : test.getClass().getDeclaredMethods()) {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(test);
        }
    }
}
