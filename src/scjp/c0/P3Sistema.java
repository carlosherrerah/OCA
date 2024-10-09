package scjp.c0;

public class P3Sistema {

  public static void main(String[] args) {
    int n = 20;

    System.out.println("Binario de :     " + n + " es: " + Integer.toBinaryString(n));
    System.out.println("Octal de:        " + n + " es: " + Integer.toOctalString(n));
    System.out.println("Hexadecimal de : " + n + " es: " + Integer.toHexString(n));

    n = -20; // Complementos a 2
    System.out.println("Binario de :     " + n + " es: " + Integer.toBinaryString(n));
    System.out.println("Octal de:        " + n + " es: " + Integer.toOctalString(n));
    System.out.println("Hexadecimal de : " + n + " es: " + Integer.toHexString(n));

    // Sistemas
    int b = 0b1010; // 10
    int B = 0B1010; // 10

    int o = 015;
    int O = 015;

    int h = 0xFea;
    int H = 0XFE0;
    
    System.out.println(b);

    float x = 0Xb1;  // Que numero es? 
  }

}
