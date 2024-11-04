package scjp.c4;

public class P1Comp2 {
  public static void main(String[] args) {
    int a = 123;
    Integer A = new Integer("123"); // new Integer(123);   123
    System.out.println(a == A);         // true
    System.out.println(A.equals(a));    // true    
    System.out.println("longitud: " + A.toString().length());  

    byte b = 5;
    System.out.println(b + " en Binario  : " + Integer.toBinaryString(b));
    System.out.println(b + " invertido   : " + Integer.toBinaryString(~b));
    System.out.println(b*-1 +"            : " + Integer.toBinaryString(~b+1));  // 2's complement
    byte c = -6;
    System.out.println(c + " en Binario : " + Integer.toBinaryString(c));
    
    String binario = Integer.toBinaryString(c);
    String binarioFormateado = binario.replaceAll("(.{4})(?=.)", "$1_"); // Cambia "_" por " " si prefieres espacios
    System.out.println(c + " en binario : " + binarioFormateado);
    // (.{4}): Captura cualquier grupo de 4 caracteres.
    // (?=.): Es una "mirada hacia adelante" que asegura que haya al menos un carácter después del grupo de 4 caracteres,
    //        evitando agregar un guion bajo al final.
    // "$1_": Reemplaza el grupo de 4 caracteres capturado ($1) seguido de un guion bajo. 
    //        Cambia _ por un espacio si prefieres espacios en lugar de guiones bajos.


    int y=0, x = 0;

    // Operadores de asignación compuestos
    y = y - 6;
    x = x + 2 * 5;
    // Now, with compound operators:
    y -= 6;
    x += 2 * 5;


  }
}
