package ut7_03_06;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ut7_03_06 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (Scanner sc = new Scanner(System.in)) {
            LinkedList<Estudiante> grupo = new LinkedList<>();
            while (true) {
                System.out.print("Introduce el nombre del estudiante: ");
                String nombre;
                do {
                    nombre = sc.nextLine();
                } while (nombre.isEmpty());
                if (nombre.equalsIgnoreCase("FIN")) break;

                Estudiante e = new Estudiante(nombre);

                List<Float> notas = new ArrayList<>();
                System.out.println("Introduce las calificaciones, -1 para terminar:");
                while (true) {
                    float nota = sc.nextFloat();
                    if (nota == -1) break;
                    notas.add(nota);
                }
                e.setNotas(notas);

                grupo.add(e);
            }
            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("notas4.dat"))
            ){
                oos.writeObject(grupo);
            }

            try (ObjectInputStream ios = new ObjectInputStream(new FileInputStream("notas4.dat"))) {
                grupo = (LinkedList<Estudiante>) ios.readObject();
                System.out.println(grupo);
            }
        }
    }
}
