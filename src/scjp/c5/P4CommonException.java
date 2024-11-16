package scjp.c5;

public class P4CommonException {
  static String s;

  static void go() { // recursion gone bad
    go();
  }

  static int parseInt(String s) throws NumberFormatException {
    boolean parseSuccess = false;
    int result = 0;
    // do complicated parsing
    if (!parseSuccess) // if the parsing failed
      throw new NumberFormatException();
    return result;
  }

  public static void main(String[] args) {
    // go(); // StackOverflowError
    System.out.println(s.length()); // NullPointerException

    String a = "123G";
    // int b = Integer.parseInt(a); // NumberFormatException
    int b = parseInt(a); // Programmatic Exceptions
    System.out.println(b);
  }
}
