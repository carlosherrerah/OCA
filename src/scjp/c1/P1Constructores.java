package scjp.c1;

class Padre {
  
  Padre() { System.out.println("hola");  }

  public Padre(int x) {
  }
}

class Hijo extends Padre {

  public Hijo(int x) {
    //super();  
    System.out.println("adios");
  }
}

public class P1Constructores {

  public static void main(String[] args) {
    Hijo h = new Hijo(10);
  }

}

