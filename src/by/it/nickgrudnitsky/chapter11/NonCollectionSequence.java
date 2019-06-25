package by.it.nickgrudnitsky.chapter11;//: holding/NonCollectionSequence.java

import by.it.nickgrudnitsky.typeinfo.pets.Pet;
import by.it.nickgrudnitsky.typeinfo.pets.Pets;


import java.util.*;

public class NonCollectionSequence implements Iterable<Pet> {

  protected Pet[] pets = Pets.createArray(8);

  private Iterable<Pet> randomized(){
    return new Iterable<Pet>() {
      @Override
      public Iterator<Pet> iterator() {
        List<Pet> shuffled = new ArrayList<>(Arrays.asList(pets));
        Collections.shuffle(shuffled, new Random());
        return shuffled.iterator();
      }
    };
  }

  private Iterable<Pet> reversed(){
    return new Iterable<Pet>() {
      @Override
      public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
          int current = pets.length;
          @Override
          public boolean hasNext() {
            return current-- > 0;
          }

          @Override
          public Pet next() {
            return pets[current];
          }
        };
      }
    };
  }

  @Override
  public Iterator iterator() {
    return new Iterator() {
      int current = 0;
      @Override
      public boolean hasNext() {
        return current < pets.length ;
      }

      @Override
      public Object next() {
        return pets[current++];
      }
    };
  }

  public static void main(String[] args) {
    NonCollectionSequence nc = new NonCollectionSequence();
    for (Pet pet : nc) {
      System.out.print(pet + " ");
    }
    System.out.println();
    for (Pet pet : nc.reversed()) {
      System.out.print(pet + " ");
    }
    System.out.println();
    for (Pet pet : nc.randomized()) {
      System.out.print(pet + " ");
    }
  }
}