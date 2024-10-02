package scjp.c2;

class Animal {
  String especie = "ET";
  public void eat() {
    System.out.println("Generic Animal Eating Generically");
  }

  private void drink() {
    System.out.println("Animal drinking");
  }
}

class Horse extends Animal {
  String especie = "Equino";
  public /* private */ void eat() { // whoa! - it's private!
                                    // Cannot reduce the visibility of the inherited method from Animal
    System.out.println("Horse eating hay, oats, " + "and horse treats");
  }

  public void neigh() {
  }
}

public class P2Herencia { // TestAnimals
  public static void main(String[] args) {
    Animal a = new Animal();
    Animal b = new Horse(); // Animal ref, but a Horse object
    Horse c = new Horse();
    a.eat(); // Runs the Animal version of eat()
    b.eat(); // Runs the Horse version of eat()
    System.out.println(b.especie);
    System.out.println(c.especie);
  
  }
}
