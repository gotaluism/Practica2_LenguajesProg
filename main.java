import java.util.Scanner;
public class Main{
    public static void main(String[] args){

       Scanner Scan = new Scanner(System.in);

		  System.out.println("¿Que desea hacer?");
	                
      System.out.println(" ");
		        
      System.out.println("1|Tomar el resultado de una       búsqueda (leyendo un archivo plano de la metadata de algún buscador web), \n de un numero (por ejemplo el año de nacimiento de uno de los integrantes del grupo), y \n procesar ese resultado, mostrando 3 hechos relevantes. Usar tipos genéricos y gestionar los posibles valores nulos.");
		        
      System.out.println(" ");
		        
      System.out.println("2|Tomar el resultado de una búsqueda (leyendo un archivo plano de la metadata de algún buscador web), \n de una palabra (cualquiera que el grupo elija), y procesar ese resultado, mostrando 5 \n hechos relevantes. Usar tipos genéricos y gestionar los posibles valores nulos.");
		        
      System.out.println(" ");
		        
      System.out.println("3|Tomar el resultado de una búsqueda (leyendo un archivo plano de la metadata de algún buscador web), \n de un texto (más de dos palabras, con espacios), y procesar ese resultado, mostrando 5 \n hechos relevantes. Usar tipos genéricos y gestionar los posibles valores nulos.");

      int n = Scan.nextInt();

       ManipularCSV archivo = new ManipularCSV();
    
        archivo.leerArchivo("Metadatos1.csv");
          
      }
      
	}

