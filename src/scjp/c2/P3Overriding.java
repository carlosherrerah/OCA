package scjp.c2;

import java.io.FileNotFoundException;

class X {}
class Y extends X {}

class Base{
  public X getValue() throws Exception { return null; }                //byte 1 overridden
}
class Base2 extends Base  {
  public Y getValue() /* throws FileNotFoundException */  { return null; }  //byte 2 overriding
}

public class P3Overriding {
  
}
