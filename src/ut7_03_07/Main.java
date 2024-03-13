package ut7_03_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<String, Empresa> empresas = new LinkedHashMap<>();
    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        int opcion;
        do {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1. Listado de empresas: ");
            System.out.println("2. Búsqueda de empresa por CIF: ");
            System.out.println("3. Alta de una nueva empresa: ");
            System.out.println("4. Baja de una empresa por CIF: ");
            System.out.println("5. Modificiación de una empresa por CIF: ");
            System.out.println("0. Salir ");
            System.out.println(" ");
            System.out.println("Selecciona una opción: ");
            opcion = s.nextInt();
            s.nextLine();

            switch (opcion) {
                case 1:
                    listarEmpresas();
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("Introduzca el CIF de la empresa: ");
                    String buscarCif = s.nextLine();
                    buscarEmpresa(buscarCif);
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println("Introduce un CIF: ");
                    String altaCif = s.nextLine();
                    altaEmpresa(altaCif);
                    System.out.println(" ");
                    break;

                case 4:
                    System.out.println("Introduzca el CIF de la empresa: ");
                    String bajaCif = s.nextLine();
                    bajaEmpresa(bajaCif);
                    System.out.println(" ");
                    break;

                case 5:
                    System.out.println("Introduce el CIF de la empresa: ");
                    String modificarCif = s.nextLine();
                    empresas.get(modificarCif);
                    menuModificacion(modificarCif);
                    System.out.println(" ");
                    break;

                case 0:
                    System.out.println("Saliendo del programa. ");
                    break;

                default:
                    System.out.println("Opción no válida, inténtelo de nuevo: ");
                    mostrarMenu();
            }
        } while (opcion != 0);
    }

    private static void bajaEmpresa(String bajaCif) {
        if (empresas.containsKey(bajaCif)) {
            empresas.remove(bajaCif);
            System.out.println("Empresa eliminada correctamente.");
        } else {
            System.out.println("No se encontró ninguna empresa con el CIF proporcionado.");
        }
    }

    public static void altaEmpresa(String altaCif) {
        if (empresas.containsKey(altaCif)) {
            System.out.println("El CIF proporcionado ya existe.");
        } else {
            empresas.put(altaCif, crearEmpresa());
        }
    }

    private static Empresa crearEmpresa() {
        System.out.println("Introduce una razón social: ");
        String razonSocial = s.nextLine();
        System.out.println("Introduce un teléfono: ");
        String telefono = s.nextLine();
        System.out.println("Introduce el año de constitución de la empresa: ");
        int anioConstitucion = s.nextInt();
        s.nextLine();
        System.out.println("Introduce un nombre de contacto: ");
        String nombreContacto = s.nextLine();
        return new Empresa(razonSocial, telefono, anioConstitucion, nombreContacto);
    }

    private static void buscarEmpresa(String buscarCif) {
        if (empresas.containsKey(buscarCif)) {
            System.out.println(empresas.get(buscarCif));
        } else {
            System.out.println("No se encontró ninguna empresa con el CIF proporcionado.");
        }
    }

    private static void listarEmpresas() {
        for (Empresa empresa : empresas.values()) {
            System.out.println(empresa);
        }
    }

    public static void menuModificacion(String cif) {
        int opcion2;
        do {
            System.out.println("MENÚ MODIFICACIÓN");
            System.out.println("1. Modificar razón social: ");
            System.out.println("2. Modificar teléfono: ");
            System.out.println("3. Modificar año de constitución: ");
            System.out.println("4. Modificar nombre de contacto: ");
            System.out.println("0. Salir ");
            System.out.println(" ");
            System.out.println("Selecciona una opción: ");
            opcion2 = s.nextInt();

            switch (opcion2) {

                case 1:
                    System.out.println("Introduzca nueva razón social: ");
                    s.nextLine();
                    String nuevaRazon = s.nextLine();
                    empresas.get(cif).setRazonSocial(nuevaRazon);
                    System.out.println("Razón Social modificada.");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Introduzca nuevo teléfono: ");
                    s.nextLine();
                    String nuevoTel = s.nextLine();
                    empresas.get(cif).setTelefono(nuevoTel);
                    System.out.println("Teléfono modificado.");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Introduzca nuevo año de constitución: ");
                    s.nextLine();
                    int nuevoAnio = s.nextInt();
                    empresas.get(cif).setAnioConstitucion(nuevoAnio);
                    System.out.println("Año de constitución modificado.");
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Introduzca nuevo nombre de contacto: ");
                    s.nextLine();
                    String nuevoNombre = s.nextLine();
                    empresas.get(cif).setNombreContacto(nuevoNombre);
                    System.out.println("Nombre de contacto modificado.");
                    System.out.println(" ");
                    break;
                case 0:
                    System.out.println("Saliendo de modificaciones. ");
                    mostrarMenu();
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Opción no válida, inténtelo de nuevo: ");

            }

        }while (opcion2 != 0) ;
    }
}
