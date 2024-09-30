package scjp.c2;

interface I1 {
  default int doStuff() { return 1; }
}

interface I2 { 
  default int doStuff() {  return 2; }

}


public class MultiInterface implements I1, I2 {
  
  public int doStuff() {  // public 
    return 3;
  }

  void go() {
    System.out.println(doStuff());
  }

  public static void main(String[] args) {
    new MultiInterface().go();
  }
}
