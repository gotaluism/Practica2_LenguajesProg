import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

class Funciones {

  private BufferedReader lector;

  public void leerCSV (String archivo){
  
    lector = new BufferedReader(new FileReader(archivo));
    lector.lines()
		  .distinct()
		  .map(String::toLowerCase)
		  .forEach(System.out::println);

  }

  public static void primero() {
		System.out.print("hola");
}
	
  public static void segundo() {
		System.out.print("hola2");
}
	
  public static void tercero() {
		System.out.print("hola3");
}
  
  
  public void menu(int n){
    Scanner Scan = new Scanner(System.in);
     n = Scan.nextInt();
    if( n == 1) {
    	   primero();  
       }
    else if(n == 2) {
    	   segundo();
       }
    else if(n == 3){
    	   tercero();
       }        
		Scan.close();
    
  }

}