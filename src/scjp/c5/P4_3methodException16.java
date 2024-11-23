package scjp.c5;

//Some, but not all, will compile
//All those that compile will throw an exception at runtime

class MiExcepcion extends Exception { }

class Tire {
  void doStuff() { }
}

public class P4_3methodException16 extends Tire {

  void doStuff() { // ok run-time exception
  //void doStuff() throws Throwable { // Throwable is not compatible with throws clause in Tire.doStuff()
  //void doStuff() throws Exception {  //  Exception is not compatible with throws clause in Tire.doStuff()
  //void doStuff() throws RuntimeException { // ok run-time exception
  //void doStuff() throws ArithmeticException { // ok run-time exception
  //void doStuff() throws MiExcepcion { // MiExcepcion is not compatible with throws clause in Tire.doStuff()

    System.out.println(7 / 0);
  }

  public static void main(String[] args) {
    new P4_3methodException16().doStuff();

    System.out.println(". . . Hecho");
  }

}
