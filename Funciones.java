import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.ArrayList;



class Funciones {

  public static void manipulacionString (String s){
  int A= s.indexOf("htt");
    String urlF = s.substring(A, s.length());
    System.out.println(urlF+"\n");
  }

  public ArrayList<String> funcionPrincipal (String archivo){
    ArrayList<String> list_lineas = new ArrayList<>();
  try {
    BufferedReader lector = Files.newBufferedReader(Paths.get(archivo));
    Stream<String> lineas = lector.lines();
		lineas.flatMap(line -> Stream.of(line.split(",,")))
          .filter(l->l.contains("pdf"))
          .forEach(list_lineas::add);

    
}
  catch (Exception e) {
			JOptionPane.showMessageDialog( null, e);
		} //atrapa el error cuando el metadato es nulo

    return list_lineas;
  }


  public void impresionURL(ArrayList<String> list_lineas){

    
    String url1= list_lineas.get(0);
    String url2= list_lineas.get(1);
    String url3= list_lineas.get(2);
    String url4= list_lineas.get(3);
    String url5= list_lineas.get(4);
    

    manipulacionString(url1);
    manipulacionString(url2);
    manipulacionString(url3);
    manipulacionString(url4);
    manipulacionString(url5);

 
    
  }
 

  public void menu(int n){
    Funciones funcion = new Funciones();
    if( n == 1) {
         funcion.impresionURL(funcionPrincipal("Metadatos1.csv"));
       }
    else if(n == 2) {
         funcion.impresionURL(funcionPrincipal("Metadatos2.csv"));
       }
    else if(n == 3){
    	   funcion.impresionURL(funcionPrincipal("Metadatos3.csv"));
       }        
	
    
  }


}
