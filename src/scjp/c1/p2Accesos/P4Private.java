package scjp.c1.p2Accesos;

class Circulo {
  private double radio = 5;

  private double Area(double radio) {
    // return 3.14 * radio * radio ;
    return Math.PI * Math.pow(radio, 2);
  }
  
  public double getArea() {
    return Area(radio);
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }
 
}

public class P4Private {

  public static void main(String[] args) {
    Circulo circulo = new Circulo();
    circulo.setRadio(10);
    double area =  circulo.getArea();
    System.out.println("El area del circulo es: " + area);
    System.out.println(String.format("%.4f",area));

  }

}
/*
%n: Nueva línea (similar a \n, pero más portátil).
%x: Imprime un valor hexadecimal.
%o: Imprime un valor en base octal.
%b: Imprime un valor booleano (true o false).
%t: Especificador para formatear fechas y horas (usado junto con otros caracteres adicionales para detalles de tiempo).
*/