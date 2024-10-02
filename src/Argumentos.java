import scjp.c0.P1Parametros;

public class Argumentos {

  //public static void main(String[] args) {
  public static void main(String... args) {
    int resultado=0;

    //System.out.println(args[0]);  

    for (int i = 0; i < args.length; i++) {
      System.out.println( i +  " " + args[i]);
    }
    System.out.println();

    for (String elemento : args) {    // for mejorado
      System.out.println(elemento);
    }
    System.out.println();

    resultado = P1Parametros.sumar(10, 20);
    System.out.println("La suma es : " + resultado);

    System.out.println(". . . Hecho en Argumentos");


  }

}
