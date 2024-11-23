package scjp.c5;

public class P3_3Exception {

  public static void lanzar() {
    try {
      System.out.println("try");
      throw new Exception();
      // int a = 1 / 0;
    } catch (Exception e) {
      System.out.println("catch");
      // int a = 1/0;
      throw new RuntimeException();
    } finally {
      System.out.println("finally"); // se compromete a ejecutar aunque exista otra excepción
      // throw new Error();
    }
  }

  static void badMethod()  { //
    try {
      doStuff();
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("badMethod Exception");
    }

    // doStuff(); // Si cacha la excepción, no se propaga
  }

  static void doStuff()   throws Exception  { //
    try {
      throw new Exception();
    } catch (Exception me) {
      System.out.println("doStuff   Exception");
      //throw new RuntimeException(); // NO requiere throws Exception
      //throw new Exception();      // requiere throws Exception
      throw me;                   // requiere throws Exception
    }
  }

  public static void main(String[] args) {
    lanzar();
    //badMethod();
    System.out.println(". . . Hecho!");
  }

}
