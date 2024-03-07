import java.io.DataOutputStream;

import java.io.FileOutputStream;

import java.util.*;

public class ut7_03_02 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        Set<String> nombres = new TreeSet<>();


        while(true) {
            System.out.println("Introduce el nombre del invitado (FIN para salir) : ");
            String nombre = s.nextLine().trim();
            if(nombre.equalsIgnoreCase("FIN")) break;
            nombres.add(nombre);
        }
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("invitados.dat"))
        ) {
            for (String st : nombres) {
                dos.writeUTF(st);
            }

        }

    }
}

