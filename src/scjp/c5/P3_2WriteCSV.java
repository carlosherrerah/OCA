package scjp.c5;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class P3_2WriteCSV {

  public static void main(String[] args) {
    String filePath = "src/scjp/c5/Enfermos.csv"; // Reemplaza con la ruta de tu archivo CSV
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
      bw.write("1,Alvarez,2020-01-01");
      bw.newLine();
      bw.write("2,Betancourt,2020-02-02");
      bw.newLine();
    } catch (IOException e) {
      System.err.println("IO Error");
      System.err.println(e.toString());
      e.printStackTrace();
    }
    System.out.println(". . . Hecho!");
  }
  
}
