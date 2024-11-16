package scjp.c4;

interface Foo { }

class A implements Foo {
}

class B extends A {

  public static void m2(A a) {
    if (a instanceof B)
      ((B) a).doBstuff(); // downcasting an A reference to a B reference
  }

  public static void m2(B b) {
    System.out.println("'b' refers to a B");
    if (b instanceof B)
      ((B) b).doBstuff();
  }


  public static void doBstuff() {
    System.out.println("'a' refers to a B");
  }
}

public class P3instanceOfC4 {

  public static void main(String[] args) {
    // instanceof
    System.out.println("instanceof");
    String s = "Hola";
    System.out.println(s instanceof String);
    System.out.println(s instanceof Object);
    System.out.println(s instanceof Comparable);
    System.out.println(s instanceof java.io.Serializable);
    System.out.println(null instanceof String); // false

    System.out.println("\ninstanceof con clases: a");    
    A a = new A();
    B.m2(a);

    System.out.println("\ninstanceof con clases: ab");    
    A ab = new B();
    B.m2(ab);

    System.out.println("\ninstanceof con clases: b");    
    B b = new B();
    B.m2(b);


    System.out.println(a instanceof Foo);
    System.out.println(b instanceof A);
    System.out.println(b instanceof Foo);
    
    //System.out.println(A instanceof B);  // no compila




  }
}
