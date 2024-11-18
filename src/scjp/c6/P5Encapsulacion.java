package scjp.c6;

// Encapsulacion

class Special {
  StringBuilder s = new StringBuilder("hello");

  StringBuilder getName() {
    return s;
  }

  void printName() {
    System.out.println(s);
  }
}

public class P5Encapsulacion {
  public static void main(String[] args) {
    Special sp = new Special();
    StringBuilder s2 = sp.getName();
    s2.append(" world");
    sp.printName();
  }

}
