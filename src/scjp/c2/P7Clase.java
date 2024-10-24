package scjp.c2;

class Animalito {
  String especie;

  //static String especie; // Duplicate field

  static String estatico() {
    return "Estatico Animalito ";
  }

  // static String comer() { } // Static and not static methods are not allowed at the same time.

  String comer() {
    return "De todo";
  }
}

class Perro extends Animalito {
  static String estatico() { // This is a static method, not an override
    return "Estatico Perro ";
  }

  String comer() {
    return "Croquetas";
  }

  String comerOrigen() {
    return super.comer();
  }

  public static void main(String[] args) {
    Animalito a = new Animalito();
    Perro p = new Perro();
    Animalito ap = new Perro();

    Animalito[] Animal = { new Animalito(), new Perro() };

    System.out.println("Animal: " + Animalito.estatico());
    System.out.println("Perro:  " + Perro.estatico());
    System.out.println("a:      " + a.estatico()); 
    System.out.println("p:      " + p.estatico());
    System.out.println("ap:     " + ap.estatico()); // Calls the static method on the Animalito class
    System.out.println("");
    System.out.println(((Animalito) p).estatico());
    System.out.println(p.comer()); // Calls the comer method on the p object
    System.out.println(p.comerOrigen()); // Calls the comer method on the super object
  }

}
