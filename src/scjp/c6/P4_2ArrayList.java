package scjp.c6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P4_2ArrayList {
  static int x1; // 0
  static Integer x2; // null

  public static void doStuff(int x) {
    int y = x++;
    System.out.println(y);
  }

  public static void main(String[] args) {
    doStuff(x1); // 0
    //doStuff(x2); // null pointer exception

    // Arreglos Estaticos a Dinamicos
    Integer[] a = new Integer[2];
    a[0] = 2;
    a[1] = 1;
    System.out.println(Arrays.toString(a));

    // A Dinamico
    List<Integer> lista = Arrays.asList(a);

    // A Estatico
    Integer[] b = lista.toArray(new Integer[0]);
    System.out.println(Arrays.toString(b));

    // ArrayList --------------------------------------------------------------

    List<Integer> lista1 = new ArrayList<Integer>(); // auto-boxing
    System.out.println(lista1);

    lista1.add(5);
    lista1.add(10);
    lista1.add(1, 7); // indicando la posicion a insertar
    lista1.add(0, 3);
    System.out.println(lista1);
    System.out.println("valor: " + lista1.get(2)); // obtener el valor de la posicion 2
    System.out.println("indice: " + lista1.indexOf(10)); // obtener la posicion del valor 10
    System.out.println("existe: " + lista1.contains(7)); // verificar si contiene el valor 7
    lista1.remove(2); // eliminar el valor la posicion 2
    System.out.println(lista1);
    System.out.println("tamaño: " + lista1.size());

    // Diamond Operator
    List<Integer> lista2 = new ArrayList<>();




  }

}
