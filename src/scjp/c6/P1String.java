package scjp.c6;

public class P1String {

  public static void main(String[] args) {
/*
    String s = "abc";
    String s2 = s;
    //s = s + "def";
    s = s.concat("def");
    System.out.println(s);
    System.out.println(s2);
    System.out.println(s == s2);
*/
    String s1 = "spring ";
    String s2 = s1 + "summer ";
    s1.concat("fall ");
    s2.concat(s1);
    s1 += "winter ";
    System.out.println(s1 + " : " + s2);

    String a = "abc"; // crea 1 objeto y 1 referencia
    String b = new String("abc"); // crea 2 objetos (String pool y Heap) y 1 referencia (stack)

    String x = "   hi  ";
    System.out.println(x + "t");
    System.out.println(x.trim() + "t");

    //  01234567890
    x ="UNIVERSIDAD";
    System.out.println("Longitud:  " + x.length());    // con parentesis por ser metodo
    System.out.println("Caracter:  " + x.charAt(5));   // regresa un tipo char
    System.out.println("substring: " + x.substring(6, 10));  // no incluye el 10
    System.out.println("replace:   " + x.replace("SIDA", "vih"));
    System.out.println("indexOf:   " + x.indexOf("SIDA"));

    String[] tokens = "Java#Sun#Oracle".split("#");
    System.out.println(tokens.length);    // sin parentesis por ser atributo
    System.out.println();



  }

}
