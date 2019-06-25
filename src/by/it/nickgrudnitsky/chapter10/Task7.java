package by.it.nickgrudnitsky.chapter10;

public class Task7 {
    public static void main(String[] args) {
        House house = new House();
        house.fun(true).f();


    }
}

abstract class Room {
    void f() {}
}

class House {
    Room fun(boolean b) {
        if(b){
            return new Room() {
                public void f() {
                    System.out.println(1);
                }
            };
        }
        return null;
    }
}