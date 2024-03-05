import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ut7_01_01c {
    public static void main(String[] args) throws IOException {

        byte[] datos = { 'H', 'O', 'L', 'A' };
        try (InputStream is = new ByteArrayInputStream(datos)) {
            int leido = is.read();
            System.out.format("%c, %d\n", leido, leido);
        }
    }
}