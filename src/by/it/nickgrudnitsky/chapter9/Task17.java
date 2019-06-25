package by.it.nickgrudnitsky.chapter9;

public class Task17 {
    public static void main(String[] args) {


    }
}

interface Skills {
    int SPEAKING = 1, LISTNING = 2;
}

class Nikita implements Skills {
    void f(){
        System.out.println(SPEAKING);
        //LISTNING = 2;
        System.out.println(LISTNING);

    }
}
