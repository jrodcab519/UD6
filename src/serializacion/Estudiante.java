package serializacion;

import java.io.Serializable;
import java.util.List;

public class Estudiante implements Serializable {
    private final String nombre;
    private final float nota;
    public Estudiante(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    public String getNombre() {
        return nombre;
    }
    public float getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}
