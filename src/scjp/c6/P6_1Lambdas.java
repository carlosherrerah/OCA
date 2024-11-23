package scjp.c6;

import java.util.function.Predicate;

// Predicate is a functional interface
public class P6_1Lambdas {

  static int adder(int a, int b) {
    return a + b;
  }

  void go(Predicate<P6_1Lambdas> e) {
    P6_1Lambdas m2 = new P6_1Lambdas();
    System.out.println(e.test(m2) ? "Match" : "No match");
  }

  public static void main(String[] args) {
    // Using lambda expression
    Predicate<String> p = s -> s.length() > 5;
    System.out.println(p.test("Hello")); // false
    System.out.println(p.test("Hello World")); // true

    // Using method reference
    Predicate<String> p2 = String::isEmpty;
    System.out.println(p2.test("")); // true
    System.out.println(p2.test("Hello")); // false

    // Using lambda expression
    Predicate<Dog> p3 = d -> d.getEdad() > 5;
    System.out.println(p3.test(new Dog("Fido", 10, 5, null))); // true

    System.out.println("\nUsing lambda expression:");
    P6_1Lambdas m1 = new P6_1Lambdas();

    m1.go(x -> x instanceof P6_1Lambdas); // Match
    m1.go((P6_1Lambdas x) -> x instanceof P6_1Lambdas); // Match
    m1.go(x -> false); // No match
    m1.go(x -> 7 > 5); // Match
    m1.go(x -> adder(3, 4) == 7); // Match
    m1.go(x -> { return adder(3, 4) == 7;}); // Match

    m1.go(x -> {
      int y = 5;
      return adder(y, 5) > 10;
    }); // No Match

  }

}
