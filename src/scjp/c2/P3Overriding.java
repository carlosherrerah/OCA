package scjp.c2;

import java.io.FileNotFoundException;

class X {}
class Y extends X {}

class A {
  protected X /*int*/ getValue() throws Exception { return null; }            // overridden
}
class B extends A  {
  public Y /*int*/ getValue()  throws FileNotFoundException { return null; }  // overriding
}

public class P3Overriding {
  
}
