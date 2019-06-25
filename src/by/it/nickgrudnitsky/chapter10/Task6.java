package by.it.nickgrudnitsky.chapter10;

public class Task6 {
    public static void main(String[] args) {
       Clock clock = new Clock();
       clock.callInner();
    }
}

class Clock {
    private int time = 0;
    private void printTime(){
        System.out.println(time);
    }

    void callInner () {
        TimeTranslating timeTranslating = new TimeTranslating();
        timeTranslating.translateTime();
    }

    TimeTranslating timeTranslating = new TimeTranslating();

    void f() {
        timeTranslating.newTime = 2;
    }

    class TimeTranslating {

        private int newTime = 2;

        void translateTime () {
            time = 1;
            printTime();
        }
    }
}
