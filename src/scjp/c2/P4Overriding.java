package scjp.c2;

import java.io.FileNotFoundException;
import java.io.IOException;


class X {}
class Y extends X {}

class A {
  protected X /*int*/ getValue() throws IOException { return null; }            // overridden
}
class B extends A  {
  public Y /*int*/ getValue()   throws FileNotFoundException { return null; }  // overriding
  public int getValue(int a)   throws Exception { return 1; }                  // overloaded

}

public class P4Overriding {
  public static void main(String[] args)   {
    B b = new B();
    A a = new B();

  }
  
}
