import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);

		  System.out.println("¿Que desea hacer?");
	                
      System.out.println(" ");
		        
      System.out.println("1|Tomar el resultado de los 5 hechos más relevantes del año -2004-");
		        
      System.out.println(" ");
		        
      System.out.println("2|Tomar el resultado de los 5 hechos más relevantes de la palabra -corupccion-");
		        
      System.out.println(" ");
		        
      System.out.println("3|Tomar el resultado de los 5 hechos más relevantes de la frase - analisís de pobreza en colombia-");

      var n = Scan.nextInt();
    
      Funciones funcion = new Funciones();

     
      funcion.menu(n);
      
      
      }
      
	}

