package scjp.c3;

import java.time.LocalDate;
import java.awt.Dimension;

public class P4Inicializacion {
  int year;
  String name;

  public /*static*/ void showYear() {
    System.out.println("The year is " + year);
  }

  public static void main(String[] args) {
    String s1 = "Hola";
    String s2 = new String("Hola");
    String s3 = s1;
    String s4 = s2;

    System.out.println(s1 == s2); // false
    System.out.println(s1 == s3); // true
    System.out.println(s2 == s4); // true

    System.out.println(s1.equals(s2)); // true
    s2 = s2 + "Mundo";
    System.out.println(s4);

    P4Inicializacion p = new P4Inicializacion();
    int year;
    // /* if (args[0] != null) */{
    //  year = 2010;
    // }
    // System.out.println(year); // No compila
    System.out.println(p.year);
    System.out.println(p.name);
    p.showYear();
    // showYear(); // No compila
    // p.name.toUpperCase(); // NullPointerException
    String s = p.name;
    if (s != null) {
      String t = s.toLowerCase();
    }

    int[] arreglo = new int[5];  // Es un array de 5 elementos, todos inicializados a 0
    System.out.println(arreglo[0]);

    // Reemplazar Date con LocalDate
    LocalDate d = LocalDate.ofEpochDay(0);  // 1970-01-01
    System.out.println(d);

    LocalDate d2 = LocalDate.of(2015, 1, 1);
    //LocalDate d2 = LocalDate.parse("2015-01-01");
    LocalDate d3 = LocalDate.now();
    System.out.println(d3);
    LocalDate d4; 
    //System.out.println(d4); // No compila
   
    Dimension a = new Dimension(5,10);
    System.out.println(a.width + ":" +a.height);  // 5:10
    Dimension b = a;
    b.width = 30;
    System.out.println(a.width + ":" +a.height); // 30:10


  }

}