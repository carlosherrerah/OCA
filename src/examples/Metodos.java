package examples;

public class Metodos {

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
    r = x < 0 ? -1 : 1;
    return r;
  }

  public static void pn0(int x) {
    if (x > 0) {
      System.out.println("El valor de " + x + " es positivo");
    } else if (x < 0) {
      System.out.println("El valor de " + x + " es negativo");
    } else {
      System.out.println("El valor de " + x + " es cero");
    }
  }

  public static int pnn(int x) {
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

  public static void main(String[] args) {
    int r = 0;

    System.out.println(esParImpar(10));
    System.out.println(esPositivoNegativo(10));

    pn0(10);

    r =  pnn(10);
    System.out.println(r);

    System.out.println(pnnTernario(10));

  }

}
