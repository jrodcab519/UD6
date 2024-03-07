import java.io.*;
import java.util.Scanner;

public class ut7_03_03_a {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner s = new Scanner(System.in);
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("quiniela.dat"))) {


            System.out.println("Introduce el número de jornadas:");
            int jornadas = s.nextInt();
            dos.writeInt(jornadas);

            System.out.println("Introduce el número de partidos por jornada:");
            int partidos = s.nextInt();
            dos.writeInt(partidos);
            s.nextLine();

            for (int i = 0; i < jornadas; i++) {
                System.out.println("Introduce Fecha de la jornada:");
                String fecha = s.nextLine();
                dos.writeUTF(fecha);

                for (int j = 1; j <= partidos; j++) {
                    System.out.println("Goles del equipo " + j + ", separados por un espacio:");
                    String resultado = s.nextLine();
                    String[] goles =  resultado.split(" ");
                    int golesEquipo1 = Integer.parseInt(goles[0]);
                    int golesEquipo2 = Integer.parseInt(goles[1]);

                    dos.writeInt(golesEquipo1);
                    dos.writeInt(golesEquipo2);
                }
            }
        }
    }
}
