import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ut7_01_01b {
    public static void main(String[] args) throws IOException{

        byte[] datos = { 'H' , 'O', 'L', 'A' };

        InputStream is = new ByteArrayInputStream(datos);
        try {
            int n = 1;
            while (true) {
                int leido = is.read();
                if (leido == -1) break;
                System.out.format("%d: %c, %d\n", n++, leido, leido);
            }
        } finally {
            is.close();
        }
    }
}


