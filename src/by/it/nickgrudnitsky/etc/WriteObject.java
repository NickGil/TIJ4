package by.it.nickgrudnitsky.etc;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Nick"), new Person(2, "Tom"),new Person(3, "Bob")};


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/IT-Academy/TIJ4/src/by/it/nickgrudnitsky/people.bin"))){
            oos.writeObject(people);

            /*oos.writeInt(people.length);

            for (Person person : people) {
                oos.writeObject(person);
            }*/

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
