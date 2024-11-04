package scjp.c4;

public class P2Relacionales {

  public static void main(String[] args) {

    // Operadores relacionales
    System.out.println("Operadores relacionales");
    boolean b1 = 10 > 5;
    System.out.println(b1);
    boolean b2 = 'h' >  'H';
    System.out.println(b2); 

    boolean b3 = "caballo".compareTo("animal") > 0;
    System.out.println(b3);   
    boolean b4 = "caballo".compareTo("caballo") == 0;
    System.out.println(b4);
    boolean b5 = "caballo".compareTo("animal") < 0; 
    System.out.println(b5);
    boolean b6 = "caballo".compareTo("caballo") != 0;
    System.out.println(b6);

    // preguntar por true o false
    System.out.println("\nPreguntar por true o false:");
    boolean b = false;
    if (b = false) { System.out.println("b is false");   // b es puesta a false y se evalua b
    } else { System.out.println("b is true"); }

    if (b) { System.out.println("B is true");       // se pregunta si b es true
    } else { System.out.println("B is false"); }

    if (!b) { System.out.println("B es FALSA");    // se pregunta si b es false
    } else { System.out.println( "B es VERDADERA"); }

    int a = 1;
    //if (a = 1) { System.out.println("a is 1"); 
    //} else { System.out.println("a is not 1"); }
 

    System.out.println(". . . Hecho . . .");
    
  }
  
}
