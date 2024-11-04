package scjp.c4;

public class P5Ternary {

  public static void main(String[] args) {
    int x = 10;
    int y = 5;
    int z = 0;
    z = (x > y) ? x : y;
    System.out.println(z);  

    // operador ternario que regrese 1, -1 , 0 de un valor de x
    x = 0;
    z = (x > 0) ? 1 : (x < 0) ? -1 : 0;
    System.out.println(z);

    // operador ternario que regresa: positivo, negativo, neutro  de un valor de x
    String s = (x > 0) ? "positivo" : (x < 0) ? "negativo" : "neutro";
    System.out.println(s);

    // operador ternario que regresa segun la edad de una persona, la etapa de la vida en la que se encuentra
    int edad = 20;
    String etapa = (edad < 18) ? "niño" : (edad < 30) ? "joven" : (edad < 60) ? "adulto" : "anciano";  
    System.out.println(etapa);
    

    
  }
}
