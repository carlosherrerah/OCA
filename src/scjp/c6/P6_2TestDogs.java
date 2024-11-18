package scjp.c6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class P6_2TestDogs {

  public static void main(String[] args) {
    List<Dog> result = new ArrayList<>();
    List<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog("boi", 30, 6, LocalDate.of(2018, 10, 21)));
    dogs.add(new Dog("tyri", 40, 12, LocalDate.parse("2012-01-20")));
    dogs.add(new Dog("charis", 120, 7, LocalDate.of(2017, 1, 20)));
    dogs.add(new Dog("aiko", 50, 10, LocalDate.parse("2014-10-20")));
    dogs.add(new Dog("clover", 35, 12, LocalDate.parse("2012-05-25")));
    dogs.add(new Dog("mia", 15, 4, LocalDate.parse("2020-11-20")));
    dogs.add(new Dog("zooey", 45, 8, LocalDate.parse("2016-09-18")));

    System.out.println("all dogs: " + dogs);

    List<Dog> edadMinimaList = Dog.edadMinima(dogs, 10);
    System.out.println("Edad Minima de 10: " + edadMinimaList);

    List<Dog> pesoMaximoList = Dog.pesoMaximo(dogs, 30);
    System.out.println("Peso Maximo de 30: " + pesoMaximoList.toString());

    List<Dog> pesoMinimoList = Dog.dogQuery(dogs, d -> d.getPeso() >= 50); // lambda expression
    System.out.println("Peso Minimo de 50: " + pesoMinimoList);

    result = Dog.dogQuery(dogs, d -> d.nacimiento.isAfter(LocalDate.of(2017, 12, 31)));
    System.out.println("Mayores al 2017 : " + result);

    result = dogs.stream().filter(d -> d.nacimiento.isAfter(LocalDate.of(2017, 12, 31))).collect(Collectors.toList());
    System.out.println("Mayores al 2017-: " + result);

  }

}
