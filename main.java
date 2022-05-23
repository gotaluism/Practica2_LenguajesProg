import java.util.Scanner;
//1) supongo en java funcional no es valido usar ciclos ni condicionales, pero ya lo puse F

// 2)supongo que hay que scrapear los resultados de una palabra en especifico en google y despues importar
//eso con metadatos. enlace interesante-> https://helpcenter.octoparse.es/hc/es/articles/360056976234-Scrapear-datos-de-Google-Search
// https://metadato.org/

public class main{
    public static void main(String[] args){

        System.out.println("¿Que desea hacer?");
        System.out.println("                   ");
        System.out.println("1|Tomar el resultado de una búsqueda (leyendo un archivo plano de la metadata de algún buscador web), de un numero (por ejemplo el año de nacimiento de uno de los integrantes del grupo), y procesar ese resultado, mostrando 3 hechos relevantes. Usar tipos genéricos y gestionar los posibles valores nulos.");
        System.out.println("           ");
        System.out.println("2|Tomar el resultado de una búsqueda (leyendo un archivo plano de la metadata de algún buscador web), de una palabra (cualquiera que el grupo elija), y procesar ese resultado, mostrando 5 hechos relevantes. Usar tipos genéricos y gestionar los posibles valores nulos.");
        System.out.println("            ");
        System.out.println("3|Tomar el resultado de una búsqueda (leyendo un archivo plano de la metadata de algún buscador web), de un texto (más de dos palabras, con espacios), y procesar ese resultado, mostrando 5 hechos relevantes. Usar tipos genéricos y gestionar los posibles valores nulos. Repositorio en GitHub actualizado Sin evidencia/ producto no entregado No se incluyen todos los elementos Estan todos los elementos pero incompletos o incorrectos Todos los elementos ");

        Scanner entrada=new Scanner (System.in);
        int valor=entrada.nextInt();

        switch (valor){
            case 1: System.out.println("Hola");
            break;

            case 2: System.out.println("Hola2");
            break;

            case 3: System.out.println("Hola3");
            break;






        }
    }


}
