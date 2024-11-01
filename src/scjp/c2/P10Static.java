package scjp.c2;

class Frog {
  static /*static*/ int frogCount = 0; // Declare and initialize static variable
  int x = 3;

  public Frog() {
    frogCount += 1; // Modify the value in the constructor
  }

  public static void main(String[] args) {
    new Frog();
    new Frog();
    Frog f = new Frog();
    Frog f2 = new Frog();
    System.out.println("Frog count is now " + frogCount);
    System.out.println("Frog count is now " + f.frogCount);
    System.out.println("Frog count is now " + Frog.frogCount);
    //System.out.println("x is now " + x); 
  }
}