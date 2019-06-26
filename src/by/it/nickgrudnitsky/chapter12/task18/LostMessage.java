package by.it.nickgrudnitsky.chapter12.task18;

class VeryImportantException extends Exception {
  public String toString() {
    return "A very important exception!";
  }
}

class HoHumException extends Exception {
  public String toString() {
    return "A trivial exception";
  }
}

class InconsiderableException extends Exception {
  public String toString() {
    return "An inconsiderable exception";
  }
}

public class LostMessage {
  void f() throws VeryImportantException {
    throw new VeryImportantException();
  }

  void g() throws HoHumException {
    throw new HoHumException();
  }

  void dispose() throws InconsiderableException {
    throw new InconsiderableException();
  }
  public static void main(String[] args) {
    try {
      LostMessage lm = new LostMessage();
      try {
        try {
          lm.f();
          lm.g();
        } finally {
          lm.dispose();
        }
      } catch (Exception e){
        System.out.println(e);
      }
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}