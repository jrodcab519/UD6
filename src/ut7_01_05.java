import java.io.*;

public class ut7_01_05 {
    public static void main(String[] args) {

        try (
                InputStream is = new FileInputStream("ejemplo.txt");
                OutputStream os = new FileOutputStream("salida.txt")
        ) {
            int n = 1;
            while (true) {
                int dato = is.read();
                if (dato == -1) break;
                if (n++ % 2 == 0) {
                    os.write(dato);
                }
                is.close();
                os.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el fichero");
        }
    }
}
