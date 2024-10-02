package scjp.c1.p2Accesos.d2;
import scjp.c1.p2Accesos.d1.Parent;

public class Child extends Parent{

  public void testIt() {
    System.out.println("x = " + x);

    Parent p = new Parent();
    //System.out.println("x = " + p.x);  // variable x is not visible here

    Child q = new Child();
    System.out.println("x = " + q.x);
  }
  
  public static void main(String[] args) {
    Child c = new Child();
    c.testIt(); 
  }

}
