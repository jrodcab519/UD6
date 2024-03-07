import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ut7_01_09 {
    public static void main(String[] args) {

        try(BufferedReader br= new BufferedReader(new FileReader("quijote.txt"))){
            String linea;
            while ((linea = br.readLine()) != null) {

                String[] palabras = linea.split(" ");
                

                List<String> lista = Arrays.asList(palabras);


                Collections.sort(lista);
                Arrays.sort(palabras);
            }
        }catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }catch (IOException e){
            System.out.println("Error de lectura");
        }
    }
}
