package by.it.nickgrudnitsky.etc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/IT-Academy/TIJ4/src/by/it/nickgrudnitsky/people.bin"))){

            Person[] people = (Person[]) ois.readObject();

            for (Person person : people) {
                System.out.println(person);
            }

            /*int i = ois.readInt();

            for (int j = 0; j < i; j++) {
                System.out.println(ois.readObject());
            }*/

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
