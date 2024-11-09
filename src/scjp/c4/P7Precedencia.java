package scjp.c4;

public class P7Precedencia {
  public static void main(String[] args) {
    System.out.println(true & false == false | true);
    System.out.println(true & (false == false) | true);
    System.out.println(true & (false == false | true));
    System.out.println((true & false) == (false | true));
    System.out.println((true & false) == false | true);
    System.out.println(true & false == (false | true));

    boolean flag1 = true;
    boolean flag2 = false;
    boolean flag3 = true;
    boolean flag4 = false;

    System.out.println(!flag1 == flag2 != flag3 == !flag4); // Line n1 false
    System.out.println(flag1 = flag2 != flag3 == !flag4); // Line n2 true

    System.out.println("-----");
    boolean flag = false;
    System.out.println((flag = true) | (flag = false) || (flag = true));
    System.out.println(flag);
    // bitwise inclusive OR | has higher precedence over logical OR ||
    // || is a short-circuit operator and as left operand evaluates to true, hence
    // right operand is not evaluated.

    System.out.println("-----");

    int a = 5;
    int b = 10;
    int c = 15;
    boolean result;

    // Ejemplo de precedencia de operadores
    result = a + b * c > b && b - a < c || a == 5;
    // Evaluación paso a paso:
    // 1. Multiplicación: b * c = 10 * 15 = 150
    // 2. Suma: a + 150 = 5 + 150 = 155
    // 3. Relacional: 155 > 10 = true
    // 4. Resta: b - a = 10 - 5 = 5
    // 5. Relacional: 5 < c = 5 < 15 = true
    // 6. Lógico AND: true && true = true
    // 7. Igualdad: a == 5 = true
    // 8. Lógico OR: true || true = true

    System.out.println("Resultado: " + result); // true

    // Otro ejemplo con operadores de asignación y ternario
    int x = 1;
    int y = 2;
    int z = 3;
    int result2 = x > y ? x + y : x - y * z;
    // Evaluación paso a paso:
    // 1. Relacional: x > y = 1 > 2 = false
    // 2. Ternario: false ? x + y : x - y * z
    // 3. Multiplicación: y * z = 2 * 3 = 6
    // 4. Resta: x - 6 = 1 - 6 = -5

    System.out.println("Resultado2: " + result2); // -5

    // Pregunta 11
    boolean b1 = false;
    boolean b2;
    x = 2; // 
    y = 5; // 
    b1 = 2 - 12 / 4 > 5 + -7 && b1 != y++ > 5 == 7 % 4 > ++x | b1 == true;

    System.out.println("b1 : " + b1);
    System.out.println("x  : " + x);
    System.out.println("y  : " + y);

    // b1 = true, x = 3, y = 6
    b2 = (2 - 12 / 4 > 5 + -7) && (b1 != y++ > 5) == (7 % 4 > ++x) | (b1 == true);

    System.out.println("b1 : " + b1);
    System.out.println("b2 : " + b2);
    System.out.println("x  : " + x);
    System.out.println("y  : " + y);
    // b1 = true,  b2 = true,  x = 4, y = 7

  }
}
