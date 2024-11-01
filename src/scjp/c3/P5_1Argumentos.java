package scjp.c3;

import java.awt.Dimension;

public class P5_1Argumentos {
  static int size = 7;

  static void changeIt(int size) {
    size = size + 200;
    System.out.println("size in changeIt is " + size);
  }

  void modify(int number) {
    number = number + 1;
    System.out.println("number = " + number);
  }

  void modify(Dimension dim) {
    dim.height = dim.height + 1;
    System.out.println("dim = " + dim.height);
  }

  public static void main(String[] args) {
    // pase por valor
    int a = 1;
    P5_1Argumentos rt1 = new P5_1Argumentos();
    System.out.println("Before modify() a = " + a);
    rt1.modify(a);
    System.out.println("After  modify() a = " + a);

    // pase por referencia
    System.out.println("\nObject reference example");
    Dimension d = new Dimension(5, 10);
    P5_1Argumentos rt2 = new P5_1Argumentos();
    System.out.println("Before modify() d.height = " + d.height);
    rt2.modify(d);
    System.out.println("After  modify() d.height = " + d.height);

    System.out.println("\nsize = " + size);
    changeIt(size);   // shadowing
    System.out.println("size after changeIt is " + size);  
  }
}
