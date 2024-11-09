package scjp.c3;
import java.util.Date;

public class P6_1GarbageC {
    public static void doComplicatedStuff() {}
  public static void main(String[] args) {
    Date d = getDate();
    doComplicatedStuff();
    System.out.println("d = " + d);
  }

  public static Date getDate() {
    Date d2 = new Date();
    StringBuffer now = new StringBuffer(d2.toString());
    System.out.println(now); // candidate for garbage collection
    return d2;               // Not a candidate for garbage collection
  }

}
