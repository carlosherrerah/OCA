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
      System.out.println("finally");  // se compromete a ejecutar aunque exsita otra excepción
      // throw new Error();
    }
  }

  static void badMethod()  /* throws Exception */   { // No need to declare an Error
    try {
      doStuff();
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("badMethod Exception");
    }

    //doStuff(); // Si cacha la excepción, no se propaga

  }

  static void doStuff()  throws Exception  { // 
    try {
      throw new Exception();
    } catch (Exception me) {
      System.out.println("doStuff   Exception");
      //throw new RuntimeException(); 
      //throw new Exception(); // throws Exception
      throw me;                // throws Exception
    }
  }

  public static void main(String[] args)  {
    //lanzar();
    badMethod();
    System.out.println(". . . Hecho!");
  }

}
