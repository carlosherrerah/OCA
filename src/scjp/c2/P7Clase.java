package scjp.c2;

class Animalito {
  static String estatico() {
    return "Animalito";
  }

  String comer() {
    return "De todo";
  }
}

class Perro extends Animalito {
  static String estatico() { // static methods can’t be overridden!
    return "Perro ESTATICO";
  }

  String comer() {
    return "Croquetas";
  }

  String comerOrigen() {
    return super.comer();
  }

  public static void main(String[] args) {
    Animalito a = new Animalito();
    Animalito ap = new Perro();
    Perro p = new Perro();

    Animalito[] Animal = { new Animalito(), new Perro() };

    System.out.println(Perro.estatico()); // Perro
    System.out.println(Animalito.estatico()); // Animalito
    System.out.println(a.estatico()); // Animalito
    System.out.println(ap.estatico()); // Animalito
    System.out.println(p.estatico()); // Perro
    System.out.println(((Animalito) p).estatico()); // Animalito
    System.out.println(p.comer()); // Calls the comer method on the p object
    System.out.println(p.comerOrigen()); // Calls the comer method on the super object
  }

}
