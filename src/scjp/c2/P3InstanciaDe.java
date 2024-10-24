package scjp.c2;

interface Flyer { }

class Bird implements Flyer { }

class Eagle extends Bird { }

class Bat { }

public class P3InstanciaDe {
  public static void main(String[] args) {

    int x = 10;
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    String s3 = "Hello";
    String s4 = "Hello";
    System.out.println(s1 == s2);       // false
    System.out.println(s1.equals(s2));  // true
    System.out.println(s1 == s3);       // false
    System.out.println(s1.equals(s3));  // true
    System.out.println(s3 == s4);       // true
    System.out.println(s3);
    s3 = s3 + " World";
    System.out.println(s3);
    System.out.println(s4);            

    Flyer f = new Eagle();
    Bird b = new Eagle();
    Eagle e = new Eagle();
    Bat m = new Bat();

    if (f instanceof Bird) 
      System.out.println("f is a Bird"); // yes
    if (f instanceof Flyer)
      System.out.println("f is a Flyer"); // yes

    if (b instanceof Bird)
      System.out.println("b is a Bird"); // yes
    if (b instanceof Flyer)
      System.out.println("b is a Flyer"); // yes

    if (e instanceof Bird)
      System.out.println("e is a Bird"); // yes
    if (e instanceof Flyer)
      System.out.println("e is a Flyer"); // yes

    if (m instanceof Flyer)
      System.out.println("m is a Flyer"); // no
    if (m instanceof Object)
      System.out.println("m is a Object"); // yes
    if(s1 instanceof Object)
      System.out.println("s1 is a Object"); // yes
    //if(x instanceof Object)
      System.out.println("x is a Object"); // no

  }

}
