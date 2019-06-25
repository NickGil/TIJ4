package by.it.nickgrudnitsky.chapter5;

public class Task5to7 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(1, 'x');
        dog.bark('x', 1);
        dog.bark(true);
    }
}

class Dog{
    void bark(int x, char z){
        System.out.println("gav");
    }

    void bark(char x, int z){
        System.out.println("skulyt");
    }

    void bark(boolean b){
        System.out.println("voet");
    }
}