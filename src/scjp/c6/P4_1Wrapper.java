package scjp.c6;

public class P4_1Wrapper {

  public static void main(String[] args) {
    // wrapper class are immutable

    System.out.println("Booleanos: ");
    Boolean b1 = true; // auto-boxing
    Boolean b2 = true; // auto-boxing
    Boolean b3 = new Boolean(true);
    Boolean b4 = new Boolean("TrUe");
    boolean b = b1; // unboxing
    System.out.println("b1 == b2 : " + (b1 == b2));  // true
    System.out.println("b1 == b3 : " + (b1 == b3));  // false
    System.out.println("b3 == b4 : " + (b3 == b4));  // false
    System.out.println("b1 == b  : " + (b1 == b));   // true
    System.out.println("Contenido: " + b3.equals(b4)); // true

    // from –128 to 127  SAVE MEMORY ------------------------------------
    System.out.println("\nEnteros: ");    
    Integer i1 = 10;  // auto-boxing
    Integer i2 = 10;  // auto-boxing
    Integer i3 = new Integer(10);
    Integer i4 = new Integer("10");
    int x = i1; // unboxing

    System.out.println("i1 == i2 : " + (i1 == i2));  // TRUE
    System.out.println("i1 == i3 : " + (i1 == i3));  // false
    System.out.println("i3 == i4 : " + (i3 == i4));  // false
    System.out.println("i1 == x  : " + (i1 == x));   // true
    System.out.println("Contenido: " + i3.equals(i4)); // true

    // Mayores a 127   -----------------------------------------------
    System.out.println("\nENTEROS: ");    
    Integer I1 = 1000;  // auto-boxing
    Integer I2 = 1000;  // auto-boxing
    Integer I3 = new Integer(1000);
    Integer I4 = new Integer("1000");
    int y = I1; // unboxing

    System.out.println("I1 == I2 : " + (I1 == I2));  // ATENCION
    System.out.println("I1 == I3 : " + (I1 == I3));  // false
    System.out.println("I3 == I4 : " + (I3 == I4));  // false
    System.out.println("I1 == y  : " + (I1 == y ));  // true
    System.out.println("Contenido: " + I3.equals(I4)); // true


    System.out.println("\n\n------> save memory");
    Integer x1 = 10;
    Integer x2 = 10;
    if (x1 != x2)
      System.out.println("diferentes Objectos");
    if (x1.equals(x2))
      System.out.println("mismo valor");

    Integer x3 = 1000;
    Integer x4 = 1000;
    if (x3 == i4)
      System.out.println("mismo objeto");
    if (x3.equals(i4))
      System.out.println("mismo valor");
    System.out.println("<------");

  }

}
