package scjp.c5;

public class P4_2mainException15 {
  // Some, but not all, will compile and execute and throw an exception
  
  public static void main(String[] args) {
  // public static void main(String[] args) throws Throwable {
  // public static void main(String[] args) throws Exception {
  // public static void main(String[] args) throws RuntimeException {
  // public static void main(String[] args) throws ArithmeticException {
  // public static void main(String[] args) throws IOException { // Error compilacion: Excepcion_Checada
  
  // Todas las excepciones checadas deben estar en un bloque try-catch o en la firma del metodo
    System.out.println(7 / 0);

    System.out.println(". . . Hecho");
  }

}
