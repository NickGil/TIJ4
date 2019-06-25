package by.it.nickgrudnitsky.chapter7;

public class Task19 {
    public static void main(String[] args) {
        BlankFinal blankFinal = new BlankFinal(2);
        BlankFinal blankFinal1 = new BlankFinal();
        System.out.println(blankFinal.z);
        System.out.println(blankFinal1.z);
        //blankFinal.z = 0; final
    }
}

class BlankFinal {
    final int z;

    public BlankFinal() {
        z = 1;
    }

    public BlankFinal(int z) {
        this.z = z;
    }
}
