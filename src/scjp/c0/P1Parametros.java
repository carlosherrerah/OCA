package scjp.c0;

public class P1Parametros {

  // Method to sum two integers
  public static int sumar(int a, int b) {
    return a + b;
  }

  // Method to sum three integers
  public static int sumar(int a, int b, int c) {
    return a + b + c;
  }

  // Method to sum a variable number of integers (varargs)
  public static int sumar(int... datos) {   // Elementos sueltos
    int suma = 0;
    for (int dato : datos) {
      suma+=dato;
    }
    return suma;
  }

  // Method to sum an array of integers
  public static int sumarV(int[] datos) {  // recibe un arreglo
    int suma = 0;
    for (int dato : datos) {
      suma+=dato;
    }
    return suma;
  }

    public static void main(String[] args) {
    int[] datos = new int[]  {1, 2, 3, 4, 5};

    System.out.println(sumar(1, 2));     
    System.out.println(sumar(1, 2, 3));  
    System.out.println(sumar(1, 2, 3, 4));
    System.out.println(sumar(datos));
    System.out.println(sumarV(datos));
    
  }
  
}
