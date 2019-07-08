package by.it.nickgrudnitsky.chapter15.task8;

import by.it.nickgrudnitsky.myLibrary.Generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StoruCharsGen implements Generator<StoryCharacters> {

    private List<Class> typesList = new ArrayList<>(Arrays.asList(ChrisMannix.class, DaisyDomergue.class,
            JoeGage.class, JohnRuth.class, MajorMarquisWarren.class, OswaldoMobray.class));
   Random random = new Random();
    @Override
    public StoryCharacters next() {
        StoryCharacters character = null;
        try {
            character = (StoryCharacters) typesList.get(random.nextInt(6)).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return character;
    }

    public static void main(String[] args) {
        StoruCharsGen characters = new StoruCharsGen();
        for (int i = 0; i < 10; i++) {
            System.out.println(characters.next());
        }
    }
}
