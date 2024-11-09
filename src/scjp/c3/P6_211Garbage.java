package scjp.c3;

class Beta { }

class Alpha {
  static Beta b1;
  Beta b2;
}

public class P6_211Garbage {
  public static void main(String[] args) {
    Beta b1 = new Beta();
    Beta b2 = new Beta();
    Alpha a1 = new Alpha();
    Alpha a2 = new Alpha();
    a1.b1 = b1;
    a1.b2 = b1;
    a2.b2 = b2;
    System.out.println(a1.b1);
    System.out.println(a2.b1); 
    System.out.println(a1.b2);
    System.out.println(a2.b2);
    a1 = null;
    b1 = null;
    b2 = null;
    // do stuff
    System.out.println(". . . Hecho");
  }
}