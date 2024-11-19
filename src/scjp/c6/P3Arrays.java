package scjp.c6;

interface Domestico {
}

class Perro implements Domestico {
  String name;

  Perro(String n) {
    name = n;
  }
}

public class P3Arrays {

  public static void main(String[] args) {
    int[] a1; // recommended
    int a2[]; // legal but not recommended

    String[][] name1; // recommended
    String name2[][]; // legal but not recommended
    String[] name3[]; // legal but not recommended

    int[] scores1 = new int[5]; // recommended

    int[] scores2; // anonymous array
    scores2 = new int[5];
    scores2[0] = 1; // llenado de un array

    char[] c1 = new char[3];
    char[] c2 = { 'a', 'b', 'c' }; 
    char[] c3 = new char[] { 'a', 'b', 'c', }; 
    char[] c4 = { 0x4e, '\u004e', 78 };


    int[] scores3 = { 1, 2, 3, 4, 5 }; // recommended
    int[] scores4 = new int[] { 1, 2, 3, 4, 5 }; // recommended

    int[][] scores5 = { { 5, 2, 4, 7 }, { 9, 2 }, { 3, 4 } };

    int[][] myArray1 = new int[3][5];
    int[][] myArray2 = new int[3][];
    myArray1[0][0] = 1;
    myArray2[0] = scores3;

    // int[5] scores3; // illegal
    // int[] scores4 = new int[]; // Will not compile; needs a size
    // int[] scores5 = new int[-1]; // Will not compile; negative size

    Perro[] dogs = new Perro[2];
    dogs[0] = new Perro("Rover");
    dogs[1] = new Perro("Fido");

    Perro[] dogs2 = { new Perro("Rover"), new Perro("Fido") };

    Domestico[] pets = dogs; // legal because Perro is a Domestic, Perro implements Domestic
    // Perro[] dogs3 = pets; // illegal, because Domestic is not a Perro
    System.out.println(dogs[0] instanceof Domestico); // true

    System.out.println(". . . Hecho");
  }
}
