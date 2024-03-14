package ut7_03_07;
import java.io.Serializable;

public class Empresa implements Serializable {
    private String razonSocial;
    private String telefono;
    private int anioConstitucion;
    private String nombreContacto;

    public Empresa(String razonSocial, String telefono, int anioConstitucion, String nombreContacto) {
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.anioConstitucion = anioConstitucion;
        this.nombreContacto = nombreContacto;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getAnioConstitucion() {
        return anioConstitucion;
    }

    public void setAnioConstitucion(int anioConstitucion) {
        this.anioConstitucion = anioConstitucion;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    @Override
    public String toString() {
        return "Empresa: " +  getRazonSocial() + ", constituida en el año " + getAnioConstitucion() + ", cuya persona de contacto es: " + getNombreContacto() + " y su teléfono es: " + getTelefono();
    }


}
