package scjp.c2;

class Persona {
  void do1() {
  }
}

class Maestro extends Persona {
  void do2() {
  }
}

public class P5Casting {  // Chrome
  public static void main(String[] args) {
    Persona p  = new Persona();
    Maestro m  = new Maestro();
    Persona pm = new Maestro();

    //pm = m; 
    //m = (Maestro) pm; // no se necesita cast
    
    //p = (Persona) maestro; // no se necesita cast   p=maestro


    // m = (Maestro) p; // Persona cannot be cast to  Maestro

    ((Maestro)pm).do2(); 

    ((Persona)m).do1();

    ((Maestro)pm).do1();
    pm.do1();
    // pm.do2(); // no permitido  

    System.out.println(". . . Hecho");
  }
}
