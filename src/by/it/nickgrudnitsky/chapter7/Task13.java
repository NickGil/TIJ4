package by.it.nickgrudnitsky.chapter7;

public class Task13 {
    public static void main(String[] args) {
        Bart bart = new Bart();
        bart.doh();
        bart.doh(1);
        bart.doh(1f);
        bart.doh('1');
    }
}

class Homer {
    void doh(){

    }

    void doh(int i){

    }

    void doh(char i){

    }
}

class Bart extends Homer {
    void doh(float i){

    }
}