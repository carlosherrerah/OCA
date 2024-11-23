package scjp.c5;

public class P3_1TryCatch {

  static void doStuff() {
    doMoreStuff();
  }

  static void doMoreStuff() {
    int x = 5 / 0; // ArithmeticException is thrown here
  }

  public static void main(String[] args)  {

    try {
      throw new Exception();
    } catch (Exception e) {
      System.out.println("Exception");
    } finally {
      System.out.println("Finally");
    }

    try {
      throw new Exception();
    } catch (Exception e) {
      System.out.println("Exception");
    }

    try {
      // No throw new Exception();
      // System.out.println(5/0);
    } finally {
      System.out.println("Finally.."); // Finally.. is printed: Es una promesa que se ejecutará
    }


    //doStuff(); // Muestra la secuencia de la pila de llamadas
    
    try {
      doStuff();
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException");
    } catch (Exception e) {
      System.out.println("Exception");
    } finally {
      System.out.println("Finally");
    }
    

    System.out.println(". . . Hecho!");

  }

}
