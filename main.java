import java.util.Scanner;
//1) supongo en java funcional no es valido usar ciclos ni condicionales, pero ya lo puse F

// 2)supongo que hay que scrapear los resultados de una palabra en especifico en google y despues importar
//eso con metadatos. enlace interesante-> https://helpcenter.octoparse.es/hc/es/articles/360056976234-Scrapear-datos-de-Google-Search
// https://metadato.org/
// https://www.youtube.com/watch?v=brHO0LuRoI4 (video para scrapear los datos de google y devolverlos en archivo csv)

public class main{
    public static void main(String[] args){

       Scanner Scan = new Scanner(System.in);

		        System.out.println("¿Que desea hacer?");
	                System.out.println(" ");
		        System.out.println("1|Tomar el resultado de una búsqueda (leyendo un archivo plano de la metadata de algún buscador web), \n de un numero (por ejemplo el año de nacimiento de uno de los integrantes del grupo), y \n procesar ese resultado, mostrando 3 hechos relevantes. Usar tipos genéricos y gestionar los posibles valores nulos.");
		        System.out.println(" ");
		        System.out.println("2|Tomar el resultado de una búsqueda (leyendo un archivo plano de la metadata de algún buscador web), \n de una palabra (cualquiera que el grupo elija), y procesar ese resultado, mostrando 5 \n hechos relevantes. Usar tipos genéricos y gestionar los posibles valores nulos.");
		        System.out.println(" ");
		        System.out.println("3|Tomar el resultado de una búsqueda (leyendo un archivo plano de la metadata de algún buscador web), \n de un texto (más de dos palabras, con espacios), y procesar ese resultado, mostrando 5 \n hechos relevantes. Usar tipos genéricos y gestionar los posibles valores nulos.");
       int n = Scan.nextInt();
       if( n == 1) {
    	   primero();  
       }else if(n == 2) {
    	   segundo();
       }else {
    	   tercero();
       }        
		        
		        Scan.close();
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
}
