package scjp.c3;

class Layout { // class
  static int s = 343; // static variable
  int x; // instance variable
  {
    x = 7;
    int x2 = 5;
  } // initialization block

  Layout() {
    x += 8;
    int x3 = 6;
  } // constructor

  void doStuff() { // method
    int y = 0; // local variable
    // int z = 0; // local variable
    for (int z = 0; z < 4; z++) { // 'for' code block
      y += z + x;
    }
  }
}

public class P3Scope {
  public static void main(String[] args) {
    System.out.println(". . . Hecho");
    // doStuff();
  }

}
