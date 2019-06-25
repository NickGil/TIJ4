package by.it.nickgrudnitsky.chapter10;

import by.it.nickgrudnitsky.chapter10.controller.Event;

public class Task23 {
    public static void main(String[] args) {
        MyGreenHouse greenHouse = new MyGreenHouse();

        greenHouse.addEvent(greenHouse.new Bell(900));

        Event[] events = {
                greenHouse.new MoisturizingOn(0),
                greenHouse.new MoisturizingOff(100)
        };
        greenHouse.run();
    }
}

class MyGreenHouse extends GreenhouseControls {

    private boolean moisturizing = false;

    public class MoisturizingOn extends Event {
        @Override
        public void action() {
            moisturizing = true;
        }

        public MoisturizingOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "moisturizing is on";
        }
    }

    public class MoisturizingOff extends Event {
        @Override
        public void action() {
            moisturizing = false;
        }

        public MoisturizingOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "moisturizing is off";
        }
    }
}
