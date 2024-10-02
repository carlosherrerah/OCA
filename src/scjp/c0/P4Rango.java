package scjp.c0;

public class P4Rango {

  public static void main(String[] args) {
    // 8 primitivos: byte, short, int, long, boolean, char, float, double
    // 2^n  - 1 donde n = No. de bits :  No. Maximo

    byte a =  -128;
    Byte A =  127;

    //a = 128;  // Error: byte
    a = (byte) 514;   // // Number is "chopped"   No error
    // 0 1 2 3 . . 127  128  129  130 . . 254 255    256  257  258  259 . .  510 511 512 513 514
    // 0 1 2 3 . . 127 -128 -127 -126 . .  -2  -1      0    1    2    3 . .   -2  -1   0   1   2

    System.out.println("Byte Max:    " + Byte.MAX_VALUE);
    System.out.println("Byte Min:    " + Byte.MIN_VALUE);
    System.out.println(a);

    int x = 5, y = 6;
    double z = (double) (x + y) / 2 ;   // casting
    // z = (x + y ) / 2;
    System.out.println(z);

    byte b1 = 1, b2  = 2;
    byte b3 = (byte)  (b1 + b2);  // casting
    int  b4 =  b1 + b2;           // no casting

    int i1 = 1,  i2 = 2;
    int i3 = i1 + i2;
    System.out.println(i3);

    float f1= 1.0f,  f2 = 2.0F;
    float f3 = f1 + f2;
    System.out.println(f3);

    double d1=1.0, d2 = 2.0d, d3;
    d3 = f1 + d2;
    f3 =  (float) (d1 + d2);

    System.out.println(d3);
     



    
  }
  
}
