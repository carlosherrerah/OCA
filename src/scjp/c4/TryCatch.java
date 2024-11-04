package scjp.c4;

public class TryCatch {

  public static void main(String[] args) {

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
      // throw new Exception();
    } finally {
      System.out.println("Finally");
    }



  }

}
