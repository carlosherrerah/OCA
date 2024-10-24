package scjp.c2;

// 6 pag 240
class X {
  void do1() {
  }
}

class Y extends X {
  void do2() {
  }
}

public class P5Casting {  // Chrome
  public static void main(String[] args) {
    X x1 = new X();

    X x2 = new Y();

    Y y1 = new Y();

    x2 = y1; // ok
    y1 = (Y) x2; // ok
    
    x1 = (X) y1; // x1 = y1; // ok    


    // y1 = (Y) x1; // X cannot be cast to Y

    ((Y) x2).do2();
    ((X) y1).do1();

    ((Y) x2).do1();
    x2.do1();
    //x2.do2(); // no permitido
  
  }
}
