package scjp.c0;

public class P2Metodos {

  public static String esParImpar(int x) {
    String r = "";
    if (x % 2 == 0) {
      r = "Par";
    } else
      r = "Impar";
    return r;
  }

  public static int esPositivoNegativo(int x) {
    int r = 0;
    r = x < 0 ? -1 : 1;   // operador ternario
    return r;
  }

  public static void pn0(int x) {  // procedimiento
    if (x > 0) {
      System.out.println("El valor de " + x + " es positivo");
    } else if (x < 0) {
      System.out.println("El valor de " + x + " es negativo");
    } else {
      System.out.println("El valor de " + x + " es cero");
    }
  }

  public static int pnn(int x) {   // funcion
    if (x > 0) {
      return 1;
    } else if (x < 0) {
      return -1;
    } else {
      return 0;
    }
  }

  public static int pnnTernario(int x) {
    return x > 0 ? 1 : x < 0 ? -1 : 0;
  }
  
  public static int aleatorio(int m, int n) {  // m es el minimo y n el maximo    [m,n]
    return (int) (Math.random() * (n - m + 1) + m);
  }

  public static int getRandomNumberInRange(int min, int max) {
    if (min >= max) {
      throw new IllegalArgumentException("max must be greater than min");
    }
    return (int) (Math.random() * ((max - min) + 1)) + min;
  }



  public static void main(String[] args) {
    int r = 0;

    System.out.println(esParImpar(10));
    System.out.println(esPositivoNegativo(10));

    pn0(10);

    r =  pnn(10);
    System.out.println(r);

    System.out.println(pnnTernario(10));

    System.out.println(aleatorio(50, 55));

  }

}
