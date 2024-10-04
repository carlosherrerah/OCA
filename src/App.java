public class App {
 
  public static void main(String[] args) throws Exception {
		System.out.println("Hello, World!");
		System.out.println("\033[H\033[2J"); // limpiar pantalla
		System.out.println("Bye, World!");		

    String [] palabras = {"Welcome", "to", "Java"};
    Argumentos.main("Bienvenidos", "a", "Java"); 
    Argumentos.main(palabras);  

    System.out.println(". . . Hecho");
    }

}
