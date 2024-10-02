package scjp.c1;

enum CoffeeSize { BIG, HUGE, OVERWHELMING }; // semicolon is optional here

class Cafe {
  enum CoffeeSize { BIG, HUGE, OVERWHELMING }
  CoffeeSize opcion;
}

enum CoffeeCapacity { 
  BIG(8), HUGE(10), OVERWHELMING(16);
  public int  capacity;
  
  CoffeeCapacity(int ounces) {
    capacity = ounces;
  }

 };


public class P3Enums {
  public static void main(String[] args) {
    CoffeeSize myCoffee = CoffeeSize.BIG;
    myCoffee = myCoffee.values()[1];
    System.out.println(myCoffee);
    System.out.println(myCoffee.ordinal());

    Cafe myCafe =  new Cafe();
    myCafe.opcion = Cafe.CoffeeSize.BIG;
    System.out.println(myCafe.opcion);

    CoffeeCapacity  myCapacity = CoffeeCapacity.BIG;
    System.out.println(myCapacity + " : " + myCapacity.capacity);

    for (CoffeeSize valor : CoffeeSize.values()) {
      System.out.println(valor);
    }

    for(CoffeeCapacity d : CoffeeCapacity.values()) {
      System.out.println(d + " : " + d.capacity);
    }


    for (Cafe.CoffeeSize valor : Cafe.CoffeeSize.values()) {
      System.out.println(valor);
    }

  }
}
