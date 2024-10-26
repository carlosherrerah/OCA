package scjp.c3;

public class P2_1Primitivos {
  public static void main(String[] args) {
    char[] cMensaje = { 'M', 'u', ' ', 'd', 'o', '\u0000' };
    char nullChar = '\u0000';

    String sMensaje = "Mundo"; // String No es un primitivo

    int lenC = cMensaje.length;
    int lenS = sMensaje.length();

    int i = 0;
    while (cMensaje[i] != nullChar) {
      System.out.print(cMensaje[i] + "\t");
      i++;
    }
    System.out.println();

    for (i = 0; i < sMensaje.length(); i++) {
      System.out.print(sMensaje.charAt(i) + "\t");
    }
    System.out.println();

    char A = 'A';
    char _A = 65;
    char a = 'a';
    char _a = 97;
    char unicode_A = '\u0041';
    char unicode_a = '\u0061';

    char nextLine = '\n';
    char doubleQuote = '\"';

    char letra = 'A';
    for (int j = 0; j < 26; j++) {
      // System.out.println(A + j + "\t" + (char)(A + j));
      System.out.print(letra);
      letra++;
    }
    System.out.println();

    int n = 1000000;
    n = 1_000_000;
    n = 1_000___000;
    n = 1_00_0000;
    n = 0b1111_0000;
    long m = 1000;
    m = 1000L;

    float f = 1_0.001_002f;   // debe llevar la f al final
    double d = 3.1416;
    d = 3.1416d;
    d = 314.16e-2;
    boolean b = true;

    // Illegal
    // int a = _1000_000;
    // int a = 0b_1111_0000;
    // int a = 0x_1_0;
    // int a = 0x1_0_;
    // float a = 1_0._001_002f;
    // boolean a = TRUE;

  }

}
