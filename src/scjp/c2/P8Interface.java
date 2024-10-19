package scjp.c2;

interface DS {

  default String defecto() { // Id   default solo existe en la interface
    return "defecto de interfaz";
  }

  static String estatico() { // I.s  static existe en la interface y en la clase
    return "estatico";
  }

}

public class P8Interface implements DS {

  public String defecto() {
    return "defecto de clase";
  }

  public String defectoInterfaz() {
    return DS.super.defecto();
  }

  static String estatico() { // I.s  static existe en la interface y en la clase
    return "ESTATICO DE CLASE";
  }


  public static void main(String[] args) {
    System.out.println(DS.estatico());
    System.out.println(new P8Interface().defecto());
    //System.out.println(defecto());  // Cannot make a static reference to the non-static method

    P8Interface p10 = new P8Interface();
    System.out.println("Clase:" +  p10.defecto());
    System.out.println("Interfaz: " + p10.defectoInterfaz());

    System.out.println("-->");
    new P8Interface().go();
    
  }

  void go() {
    System.out.println(defecto());        //1
    //System.out.println(estatico());     //2  I.s The method estatico() is undefined for the type P10Interface
    System.out.println(DS.estatico());    //3

    P8Interface p10 = new P8Interface(); 
    System.out.println(p10.defecto());   
    //System.out.println(p10.estatico()); //4 The method estatico() is undefined for the type P10Interface
  }
  
}
