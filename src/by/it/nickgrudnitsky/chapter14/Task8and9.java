package by.it.nickgrudnitsky.chapter14;


import java.lang.reflect.Field;

public class Task8and9 {
    static void printObjectClasses(Object object) {
        Class aClass = object.getClass();
        System.out.println("Class is " + aClass.getSimpleName());
        for (Field declaredField : aClass.getDeclaredFields()) {
            System.out.println("Field " + declaredField.getName());
        }


        if (object.getClass().getSuperclass() != null) {
            try {
                printObjectClasses(object.getClass().getSuperclass().newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        printObjectClasses(new Tree());
    }
}

class One {
    String a = "GKF<MD";
}

class Two extends One {
    boolean b= true;
}

class Tree extends Two {
 int a = 2;

}
