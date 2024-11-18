package scjp.c6;

public class P4_1Wrapper {

  public static void main(String[] args) {
    // wrapper class are immutable

    System.out.println("Booleanos: ");
    Boolean b1 = true; // auto-boxing
    Boolean b2 = true; // auto-boxing
    Boolean b3 = new Boolean(true);
    Boolean b4 = new Boolean("True");
    System.out.println("b1 == b2 : " + (b1 == b2));
    System.out.println("b1 == b3 : " + (b1 == b3));
    System.out.println("b3 == b4 : " + (b3 == b4));
    System.out.println("Contenido: " + b3.equals(b4));

    // from –128 to 127  SAVE MEMORY ------------------------------------
    System.out.println("\nEnteros: ");    
    Integer i1 = 10;  // auto-boxing
    Integer i2 = 10;  // auto-boxing
    Integer i3 = new Integer(10);
    Integer i4 = new Integer("10");
    int i5 = i1; // unboxing

    System.out.println("i1 == i2 : " + (i1 == i2));  // Atencion
    System.out.println("i1 == i3 : " + (i1 == i3));
    System.out.println("i3 == i4 : " + (i3 == i4));
    System.out.println("i1 == i5 : " + (i1 == i5));
    System.out.println("Contenido: " + i3.equals(i4));
    Integer p = i1;
    System.out.println("p == i1  : " + (p == i1));
    i1++;
    System.out.println("p == i1  : " + (p == i1));
    i5++;
    System.out.println("i5 == i1 : " + (i5 == i1));

    // Mayores a 127   -----------------------------------------------
    System.out.println("\nENTEROS: ");    
    Integer I1 = 1000;  // auto-boxing
    Integer I2 = 1000;  // auto-boxing
    Integer I3 = new Integer(1000);
    Integer I4 = new Integer("1000");
    int i = I1; // unboxing

    System.out.println("I1 == I2 : " + (I1 == I2));  // Atencion
    System.out.println("I1 == I3 : " + (I1 == I3));
    System.out.println("I3 == I4 : " + (I3 == I4));
    System.out.println("I1 == i  : " + (I1 == i ));
    System.out.println("Contenido: " + I3.equals(I4));
    Integer q = I1;
    System.out.println("q == i1  : " + (q == I1));
    I1++;
    System.out.println("q == i1  : " + (q == I1));
    i++;
    System.out.println("i == i1  : " + (i  == I1));



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
