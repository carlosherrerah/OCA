package scjp.c1;

interface Bounceable {
  public abstract void bounce();
  // void bounce();
  // public void bounce();
  // abstract void bounce();
  // public abstract void bounce();
  // abstract public void bounce();

  /* public abstract */ void setBounceFactor(int bf);

}

interface Foo {
  int BAR = 42;

  void go();
}

class Zap implements Foo {

  public void go() {
    //BAR = 27;  // No puedes cambiar el valor de una constante
    System.out.println(BAR);
  }
}
