package scjp.c5;

public class P1Seleccion {

  public static void main(String[] args) {
    final int a = 1;
    final int b = 2;
    // final int b; b = 2; // compiler error

    int x = 0;
    switch (x) {
      case a: // ok
      case b: // compiler error
    }

    x = 7;
    switch (x) {
      case 2:
      case 4:
      case 6:
      case 8:
      case 10: {
        System.out.println("x is an even number");
        break;
      }
      default: {
        System.out.println("x is an odd number");
        break;
      }
    }

    x = 7;
    switch (x) {
      case 2:
        System.out.println("2");
      default:
        System.out.println("default");
      case 3:
        System.out.println("3");
      case 4:
        System.out.println("4");
    }

  }
}
