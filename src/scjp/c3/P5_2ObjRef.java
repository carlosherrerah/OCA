package scjp.c3;

class Bar {
  int barNum = 28;
}

class Foo {
  Bar myBar = new Bar();

  void changeIt(Bar myBar) {
    myBar.barNum = 99;
    System.out.println("myBar.barNum in changeIt is " + myBar.barNum);
    myBar = new Bar(); // local myBar is reassigned a new Bar object
    myBar.barNum = 420;
    System.out.println("myBar.barNum in changeIt is now " + myBar.barNum);
  }

  public static void main(String[] args) {
    Foo f = new Foo();
    System.out.println("f.myBar.barNum is " + f.myBar.barNum);
    f.changeIt(f.myBar);  // shadowing variable
    System.out.println("f.myBar.barNum after changeIt is " + f.myBar.barNum); // 99 or 28?
  }

}
