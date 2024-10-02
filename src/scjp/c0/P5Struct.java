package scjp.c0;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

class Empleado {
  public int id;
  public String name;
  public LocalDate birthDate;

  public Empleado(int id, String name, LocalDate nacimiento) {
    this.id = id;
    this.name = name;
    birthDate = nacimiento;
  }

  public String toString() {
    return "{ " + "id: " + id + ", " + "name: " + name + ", " + "birthDate: " + birthDate + " }";
  }
}

class Empleados {
  public static void main(String[] args) {

    Empleado emp1 = new Empleado(101, "Batman", LocalDate.of(2018, 10, 21));
    Empleado emp2 = new Empleado(102, "Robin", LocalDate.parse("2012-01-20"));

    System.out.println(emp1);

    Empleado[] emp = new Empleado[3];
    emp[0] = new Empleado(1, "Jesus", LocalDate.of(2018, 10, 21));
    emp[1] = new Empleado(2, "Maria", LocalDate.parse("2012-01-20"));
    emp[2] = new Empleado(3, "Jose", LocalDate.parse("2012-01-20"));

    for (Empleado empleado : emp) {
      System.out.println(empleado);
    }
    System.out.println();

    List<Empleado> lista = Arrays.asList(emp);
    for (Empleado empleado : lista) {
      System.out.println(empleado);
    }

  }
}
