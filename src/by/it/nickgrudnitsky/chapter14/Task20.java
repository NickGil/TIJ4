package by.it.nickgrudnitsky.chapter14;




public class Task20 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Command line is empty");
            System.exit(0);
        }
        for (String arg : args) {
            Class<?> aClass = null;
            try {
                aClass = Class.forName(arg);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (aClass != null) {
                String simpleName = aClass.getSimpleName();
                System.out.println("The name of " + simpleName + " is " + aClass.getName());
                System.out.println("Is " + simpleName + " interface? " + (aClass.isInterface() ? "yes" : "no"));
                System.out.println("Is " + simpleName + " array? " + (aClass.isArray() ? "yes" : "no"));
                System.out.println("Is " + simpleName + " primitive? " + (aClass.isPrimitive() ? "yes" : "no"));
                System.out.println("Is " + simpleName + " Annotation? " + (aClass.isAnnotation() ? "yes" : "no"));
                System.out.println("Is " + simpleName + " Synthetic? " + (aClass.isSynthetic() ? "yes" : "no"));

                //.....
            }
        }
    }
}

