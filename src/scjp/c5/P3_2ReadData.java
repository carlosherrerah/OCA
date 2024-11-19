package scjp.c5;

import java.io.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Dato {
  int id;
  String apellidos;
  LocalDate fecha;
}

public class P3_2ReadData {
  private static final String PATRON = "yyyy-MM-dd";
  private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern(PATRON);

  public static void FileReader() /* throws IOException */ {
    List<Dato> leidos = new ArrayList<>();
    Dato dato = new Dato();

    String filePath = "src/scjp/c5/Pacientes    .csv"; // Reemplaza con la ruta de tu archivo CSV
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      line = br.readLine(); // La primera línea es el encabezado
      while ((line = br.readLine()) != null) {
        String[] values = line.split(",");

        for (String value : values) {
          System.out.print(value + ",");
        }
        
        dato.id = Integer.parseInt(values[0]);
        dato.apellidos = values[1];
        dato.fecha = LocalDate.parse(values[2], DTF);
        leidos.add(dato);

        /*
         * Esta es menos eficiente
         * System.out.println("NUEVAMENTE");
         * StringTokenizer st = new StringTokenizer(line, ",");
         * while (st.hasMoreTokens()) {
         * System.out.print(st.nextToken() + " ");
         * }
         */
        System.out.println();
      }
    }  catch (IOException e) {
      System.err.println("IO Error");
      System.err.println(e.toString());
      e.printStackTrace();
    } 
    
    for (Dato elemento : leidos) {
      System.out.println(elemento.id + " : " + elemento.apellidos + " : " + elemento.fecha);
    }

  }

  public static void main(String args[]) /* throws IOException */ {
    FileReader();
    System.out.println(". . . Hecho!");
  }
}
