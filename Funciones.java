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
  int A= s.indexOf("https");
    String urlF = s.substring(A, s.length());
    System.out.println(urlF+"\n");
  }

  public ArrayList<String> funcionPrincipal (String archivo){
    ArrayList<String> list_lineas = new ArrayList<>();
  try {
    BufferedReader lector = Files.newBufferedReader(Paths.get(archivo));
    Stream<String> lineas = lector.lines();
		lineas.flatMap(line -> Stream.of(line.split(",,")))
          //.filter(l -> l.endsWith("pdf"))
          .filter(l->l.contains("pdf"))
          .forEach(list_lineas::add);

    
}
  catch (Exception e) {
			JOptionPane.showMessageDialog( null, e);
		}

    return list_lineas;
  }
