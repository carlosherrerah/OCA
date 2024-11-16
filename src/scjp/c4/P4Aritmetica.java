package scjp.c4;

public class P4Aritmetica {
  static int players = 0;

  public static void main(String[] args) {
    // operaciones con % modulo
    System.out.println(5 % 2); // 1 // 5 = 2 * 2 + 1
    System.out.println(5 % -2); // 1 // 5 = -2 * -2 + 1
    System.out.println(-5 % 2); // -1 // -5 = 2 * -2 - 1
    System.out.println(-5 % -2); // -1 // -5 = -2 * 2 - 1

    // operaciones con % modulo con decimales
    System.out.println(5.5 % 2); // 1.5 // 5.5 = 2 * 2 + 1.5
    System.out.println(5.5 % -2); // 1.5 // 5.5 = -2 * -2 + 1.5
    System.out.println(-5.5 % 2); // -1.5 // -5.5 = 2 * -2 - 1.5
    System.out.println(-5.5 % -2); // -1.5 // -5.5 = -2 * 2 - 1.5

    String a = "String";
    int b = 3;
    int c = 7;
    System.out.println(b + c + a); // 10String
    System.out.println(a + b + c); // String37
    System.out.println(a + (b + c)); // String10

    String s = "123";
    s += "45";
    s += 67;
    System.out.println(s); // 1234567

    System.out.println("players online: " + players++);
    System.out.println("The value of players is " + players);
    System.out.println("The value of players is now " + ++players);
    System.out.println("The value of players is " + players);

    int x = 2;
    int y = 3;
    if ((y == ++x) | (x < ++y)) { // cambia el operador || por |
      System.out.println("x = " + x + " y = " + y);
    }

    // final int  z = 5;
    // int w = z++;
    

  }

}
