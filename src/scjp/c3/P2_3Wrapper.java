package scjp.c3;

public class P2_3Wrapper {

  public static void main(String[] args) {

    // Autoboxing
    Integer I1 = 127;
    Integer I2 = new Integer(127);
    System.out.println(I1 == I2);
    System.out.println(I1.equals(I2));

    // Unboxing
    int i = I1;
    System.out.println(i);

    System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
    
    // Wrappers
    Long L1 = new Long(127);
    // Byte B1 = new Byte(127); // The constructor Byte(int) is undefined
    Byte B2 = new Byte("127");
    // Byte b2 = new Byte("128"); // NumberFormatException: Value out of range
    Boolean B3 = new Boolean("TrUe");
    Boolean B4 = new Boolean(true);
    System.out.println(B3.equals(B4));
    System.out.println(B3 == B4);



  }

}
