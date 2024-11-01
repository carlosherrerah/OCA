package scjp.c2;

interface I1 {
  default int doStuff() { return 1; }
}

interface I2 { 
  default int doStuff() {  return 2; }
}

public class P6MultiInterface implements I1, I2 {
  //Poner en comentarios para ver el error
  public int doStuff() {  // public 
    return 3;
  }

  void go() {
    System.out.println(doStuff());
  }

  public static void main(String[] args) {
    new P6MultiInterface().go();    // 3
    P6MultiInterface a = new P6MultiInterface();
    System.out.println(a.doStuff());   // 3

  }
}
