package by.it.nickgrudnitsky.chapter10;//: interfaces/HorrorShow.java
// Extending an interface with inheritance.

interface Monster {
  void menace();
}

abstract class DangerousMonster implements Monster {
  void destroy(){};

  @Override
  public void menace() {

  }
}

interface Lethal {
  void kill();
}

class DragonZilla extends DangerousMonster {
  public void menace() {}
  public void destroy() {}
}

abstract class Vampire extends DangerousMonster implements Lethal {
  void drinkBlood(){

  }

  @Override
  public void kill() {

  }
}

class VeryBadVampire extends Vampire {
  public void menace() {}
  public void destroy() {}
  public void kill() {}
  public void drinkBlood() {}
}

public class HorrorShow {
  static void u(Monster b) { b.menace(); }
  static void v(DangerousMonster d) {
    d.menace();
    d.destroy();
  }
  static void w(Lethal l) { l.kill(); }
  public static void main(String[] args) {
    DangerousMonster barney = new DragonZilla();
    u(barney);
    v(barney);
    Vampire vlad = new VeryBadVampire();
    u(vlad);
    v(vlad);
    w(vlad);
  }
} ///:~
