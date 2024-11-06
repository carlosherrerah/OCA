package scjp.c5;

import java.io.*;
import java.util.StringTokenizer;

public class P3_2ReadData {

  public static void FileReaderLine() {
    try { // Checked exception
      FileReader fr = new FileReader("myfile.txt");
      BufferedReader br = new BufferedReader(fr);
      String s;
      while ((s = br.readLine()) != null) {
        System.out.println(s);
      }
      fr.close();
    } catch (FileNotFoundException e) {
      System.err.println("File not found");
      System.err.println(e.getMessage());
      e.printStackTrace();
    } catch (IOException e) {
      System.err.println("IO Error");
      System.err.println(e.toString());
      e.printStackTrace();
    }
  }

  public static void FileReader() {
    String filePath = "src/scjp/c5/Catalogo.csv"; // Reemplaza con la ruta de tu archivo CSV
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      while ((line = br.readLine()) != null) {
        String[] values = line.split(",");
        for (String value : values) {
          System.out.print(value + ",");
        }
        /* Esta es menos eficiente
        System.out.println("NUEVAMENTE");
        StringTokenizer st = new StringTokenizer(line, ",");
        while (st.hasMoreTokens()) {
           System.out.print(st.nextToken() + " ");
        }
        */
        System.out.println();
      }
    } catch (IOException e) {
      System.err.println("IO Error");
      System.err.println(e.toString());
      e.printStackTrace();
    }
  }

  public static void main(String args[]) {
    FileReaderLine();
    System.out.println();
    FileReader();
    System.out.println(". . . Hecho!");
  }
}
