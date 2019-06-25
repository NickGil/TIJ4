package by.it.nickgrudnitsky.chapter10.task6;

import by.it.nickgrudnitsky.chapter10.myClass.MyClass;
import by.it.nickgrudnitsky.chapter10.myInterface.MyInterface;


public class Task6 extends MyClass {
    MyInterface returnInner(){
        return this.new InnerClass();
    }
}
