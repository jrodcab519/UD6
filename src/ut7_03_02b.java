import java.io.DataInputStream;

import java.io.EOFException;
import java.io.FileInputStream;


public class ut7_03_02b {
    public static void main(String[] args) throws Exception {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("invitados.dat"))) {
        while(true) {
            String nombre = dis.readUTF();
            if (nombre == null) {
                break;
            }
            System.out.println(nombre);
        }
        }catch (EOFException e){}
    }
}

