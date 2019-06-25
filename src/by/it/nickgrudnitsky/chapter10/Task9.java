package by.it.nickgrudnitsky.chapter10;

public class Task9 {
    public static void main(String[] args) {
        Book book = new Book();
        Readable f = book.f();
    }
}

interface Readable {

}

class Book {
    private class Page implements Readable {}

    Readable f(){
        return new Page();
    }
}
