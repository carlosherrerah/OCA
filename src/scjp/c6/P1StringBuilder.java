package scjp.c6;

public class P1StringBuilder {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("VERSO");
    sb.delete(3, 5);  // sin tocar el limite superior
    System.out.println(sb);   
    sb.insert(0, "UNI"); // inserta en la posicion 0
    System.out.println(sb);
    sb.append("SIDA"); // añade al final"
    System.out.println(sb);
    // chained methods
    sb.append("D").reverse(); // añade al final y luego invierte
    System.out.println(sb);

    
  }
}
