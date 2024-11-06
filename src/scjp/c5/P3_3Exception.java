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
      System.out.println("finally");
      // throw new Error();
    }
  }

  static void badMethod() /* throws Exception */  { // No need to declare an Error
    try {
      doStuff();
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("doStuff Exception");
    }
    // doStuff();

  }

  static void doStuff()  throws Exception  { // No need to declare an Error
    try {
      throw new Exception();
    } catch (Exception me) {
      // throw new Exception(); // We catch it, but then rethrow it
      throw me;
    }
  }

  public static void main(String[] args)  {
    //lanzar();
    badMethod();
    System.out.println(". . . Hecho!");
  }

}
