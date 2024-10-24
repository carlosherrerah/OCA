package scjp.c2;

class Animal {
  String especie = "ET";

  protected void eat() {
    System.out.println("Generic Animal Eating Generically");
  }

  private void drink() {
    System.out.println("Animal drinking");
  }

}

class Horse extends Animal {
  String especie = "Equino";
  
  protected /*private*/ void eat() { // whoa! - it's private!
                                    // Cannot reduce the visibility of the inherited method from Animal
    System.out.println("Horse eating oats " + "and horse treats");
  }

  public void neigh() {
    System.out.println("Horse neighing: relincha");
  }

}

public class P2Herencia { // TestAnimals

  public String referencia(Animal a ) { 
    return "Animal";
  }

  public String referencia(Horse h ) {
    return "Hourse";
  }


  public static void main(String[] args) {
    Animal a = new Animal();
    Animal ah = new Horse(); // Animal ref, but a Horse object
    Horse h = new Horse();
    System.out.println(ah.especie);
    ah.eat();

    a.eat(); // Runs the Animal version of eat()
    ah.eat(); // Runs the Horse version of eat()
    h.neigh();
    System.out.println(ah.especie); // Prints "ET"
    System.out.println(h.especie); // Prints "Equino"

    P2Herencia p = new P2Herencia();
    System.out.println("Referencia!");
    p.referencia(a);  // Animal
    p.referencia(h);  // Hourse
    System.out.println( "ah: " + p.referencia(ah)); 
  
    System.out.println("Casting: -----------------");
    System.out.println(h.especie);
    Animal _ah = h;
    System.out.println(_ah.especie); // Prints "ET"
    _ah.eat(); // Runs the Horse version of eat()
    
    //Horse _ha = a;          // Error de compilacion: Type mismatch: cannot convert from Animal to Horse
    //Horse __ha = (Horse) a; // Error de ejecucion:   ClassCastException Animal cannot be cast Horse

    Horse _h = (Horse) ah;
    System.out.println(_h.especie); // Prints "Equino"
    _h.eat(); // Runs the Horse version of eat()
    _h.neigh();

    ((Horse)ah).neigh(); 


  }
}
