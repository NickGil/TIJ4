package by.it.nickgrudnitsky.chapter15.task8;

public class StoryCharacters {
    final int id;
    private static int count = 0;

    public StoryCharacters() {
        this.id = count++;
    }

    @Override
    public String toString() {
        return "Character " + id;
    }
}
