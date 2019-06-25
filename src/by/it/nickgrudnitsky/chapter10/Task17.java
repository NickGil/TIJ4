package by.it.nickgrudnitsky.chapter10;

public class Task17 {
    public Task17() {
        System.out.println("Task");
    }

    class Book {
        public Book() {
            System.out.println("Book");
        }

        class Page{
            public Page() {
                System.out.println("Page");
            }
        }
    }

    public static void main(String[] args) {
        Task17 task17 = new Task17();
        Book book = task17.new Book();
        Book.Page page = book.new Page();
    }
}


