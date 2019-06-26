package by.it.nickgrudnitsky.chapter12;

public class Task22to24 {
    public static void main(String[] args) {
        try {
            FailingConstructor fail = new FailingConstructor();
            try {
                throw new ExeptionType1();
            } catch (ExeptionType1 e) {

            } finally {
                fail.dispose();
            }
        } catch (ExeptionType1 e){

        }
    }
}

class FailingConstructor {
    private DisposeClass disposeClassObject;
    private DisposeClass disposeClassObject2;
    void dispose() {

    }
    public FailingConstructor() throws ExeptionType1 {
        disposeClassObject = new DisposeClass();
        try {
            throw new ExeptionType1();
        } catch (ExeptionType1 e) {
            disposeClassObject2 = new DisposeClass();
        } finally {
            disposeClassObject2.dispose();
        }
    }
}

class DisposeClass {
    void dispose() {

    }
}
